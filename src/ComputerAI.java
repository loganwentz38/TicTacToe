import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class ComputerAI {
    public static int randNum() {
        return new Random().nextInt(TicTacToe.board.length);
    }
    public static void updateBoardComputer(String[][] board, String compChoice) {
        boolean updated = false;
        for (int lp = 0; lp < board.length; lp++) {
            for (int j = 0; j < board[lp].length; j++) {
                if (board[lp][j].equals(compChoice)) {
                    board[lp][j] = "X";
                    updated = true;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        randNum();
        int compChoice = randNum();
        System.out.println(compChoice);
        updateBoardComputer(TicTacToe.board, String.valueOf(compChoice));
    }
}
