public static String scrambleString(String input) {
    // Step 1: Convert the string into a list of characters
    List<Character> charList = new ArrayList<>();
    for (char c : input.toCharArray()) {
        charList.add(c);
    }

    // Step 2: Shuffle the list randomly
    Collections.shuffle(charList);

    // Step 3: Rebuild the string from the shuffled list
    StringBuilder scrambled = new StringBuilder();
    for (char c : charList) {
        scrambled.append(c);
    }

    return scrambled.toString();
}

public void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    //System.out.println("Kindly input a word");
    String[] inputRaw = {"Delta", "Calabar", "Kwara", "Lagos", "Jigawa", "Auchi", "Anambra", "Rivers", "Imo", "Osun", "Ekiti"};
    String wordRandomPick = inputRaw[random.nextInt(inputRaw.length)];
    String scrambledWords = scrambleString(wordRandomPick);

    //Guess the word
    boolean readyToPlay = true;
    //int playerScore = 0;

    //loop game
    outer:
    for (int i = 4; i >= 0; i--) {
        while (readyToPlay) {
            System.out.println("You have " + i + " Chances left");
            if (i != 0) {
                System.out.println("Guess this word: " + scrambledWords);
                String guessed = scanner.next().toLowerCase();
                if (wordRandomPick.equalsIgnoreCase(guessed)) {
                    System.out.println("You are Correct!");
                    break outer;
                } else {
                    System.out.println("Wrong! guess again!");
                    System.out.println("Are you willing to continue?");
                    String reply = scanner.next();
                    if (!reply.equalsIgnoreCase("yes")) {
                        System.out.println("He who fights and run away lives to fight another day!");
                        readyToPlay = false;
                        break;
                    } else {
                        System.out.println("GAME OVER!\tYOU LOST!\tTRY AGAIN!");
                        break outer;
                }
            }
        }
        scanner.close();
    }
}}
