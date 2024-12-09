import java.util.Scanner;

public class ticTacToe {
    // Enum to represent the players and empty cells
    enum Player {
        X, O, EMPTY
    }

    // 3x3 board initialized to EMPTY
    private static final Player[][] board = {
            { Player.EMPTY, Player.EMPTY, Player.EMPTY },
            { Player.EMPTY, Player.EMPTY, Player.EMPTY },
            { Player.EMPTY, Player.EMPTY, Player.EMPTY }
    };

    // Current player
    private static Player currentPlayer = Player.X;

    // Method to display the board
    private static void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (Player[] row : board) {
            for (Player cell : row) {
                System.out.print(cell == Player.EMPTY ? "-" : cell);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Method to check if a player has won
    private static boolean checkWin(Player player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || // Row
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))   // Column
                return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) || // Diagonal
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);   // Anti-diagonal
    }

    // Method to check if the board is full
    private static boolean isBoardFull() {
        for (Player[] row : board) {
            for (Player cell : row) {
                if (cell == Player.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to play the game
    private static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3 each):");

            // Take user input
            int row = scanner.nextInt() - 1; // Convert to 0-based index
            int col = scanner.nextInt() - 1;

            // Validate input
            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != Player.EMPTY) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            // Make the move
            board[row][col] = currentPlayer;

            // Check if the current player has won
            if (checkWin(currentPlayer)) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Check if the board is full
            if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a tie!");
                break;
            }

            // Switch to the other player
            currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
        }

        scanner.close();
    }

    // Main method to start the game
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        playGame();
    }
}
