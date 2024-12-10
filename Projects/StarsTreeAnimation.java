public class StarsTreeAnimation {
    public static void main(String[] args) throws InterruptedException {
        int levels = 5; // Number of levels for the pyramid

        for (;;) {
            for (int i = 1; i <= levels; i++) {
                // Clear the console
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Print the pyramid
                for (int j = 1; j <= i; j++) {
                    for (int k = levels - j; k > 0; k--) {
                        System.out.print(" ");
                    }
                    for (int l = 0; l < (2 * j - 1); l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Pause for a while
                Thread.sleep(500);
            }
        }
    }
}
