import java.util.Scanner;

public class TicTacToe {
    public static String[][] board = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };

    public static void updateBoard(String[][] board, String selectedValue)
    {
        boolean updated = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(selectedValue)) {
                    board[i][j] = "O";
                    updated = true;
                    break;
                }
            }
        }
    }
    public static void displayBoard(String[][] board){
        for ( String[] row : board){
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean gameOver = false;
        while (!gameOver) {
            
        TicTacToe game = new TicTacToe();
        displayBoard(board);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9");
        String selectedValue = scanner.nextLine();
        updateBoard(board, selectedValue);
        displayBoard(board);
        }
        System.out.println("game over");
    }

}
