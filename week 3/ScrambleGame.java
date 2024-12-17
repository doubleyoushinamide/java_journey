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
    //System.out.println("Kindly input a word");
    String inputRaw = "Mango".toLowerCase();
    String scrambledWords = scrambleString(inputRaw);

    //Guess the word

    for (int i = 4; i >= 0; i--) {
        System.out.println("You have " + i + " Chances left");
        if (i != 0) {
            System.out.println("Guess this word: " + scrambledWords);
            String guessed = scanner.next().toLowerCase();
            if (inputRaw.equalsIgnoreCase(guessed)) {
                System.out.println("You are Correct!");
                break;
            } else
                System.out.println("Wrong! guess again!");
        } else {
            System.out.println("GAME OVER!\tYOU LOST!\tTRY AGAIN!");
            break;
        }
    }
    scanner.close();
}
