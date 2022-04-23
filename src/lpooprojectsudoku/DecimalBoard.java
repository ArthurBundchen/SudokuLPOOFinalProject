package lpooprojectsudoku;

import java.util.Arrays;

/**
 *
 * @author arthur coimbra bundchen
 */
public class DecimalBoard extends Board {

    private final int size = 3;
    private int[][][] playerBoard = new int[size * size][size][size];
    private int[][][] answerBoard = new int[size * size][size][size];

    public DecimalBoard(int level) {
        super(level);
    }

    public int getSize() {
        return size;
    }

    public int[][][] getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(int[][][] playerBoard) {
        this.playerBoard = playerBoard;
    }

    public int[][][] getAnswerBoard() {
        return answerBoard;
    }

    public void setAnswerBoard(int[][][] answerBoard) {
        this.answerBoard = answerBoard;
    }

    @Override
    public void creatAnswerBoard() {
    }

    @Override
    public void addAttempt(int[][][] array) {
    }

    @Override
    public void isTryRight(int attempt, int[][][] array) {
    }

    @Override
    public boolean rowsValidation() {
        boolean check[] = new boolean[this.size];
        for (int i = 0; i < this.getSize(); i++) {
            if (this.getPlayerBoard()[i][0] != this.getPlayerBoard()[i][1] && this.getPlayerBoard()[i][0] != this.getPlayerBoard()[i][2]) {
                check[i] = true;
            } else {
                check[i] = false;
            }
        }
        return check[0] && check[1] && check[2];
    }

    @Override
    public boolean columnsValidation() {
        boolean check[] = new boolean[this.getSize()];
        for (int j = 0; j < this.getSize(); j++) {
            if (this.getPlayerBoard()[0][j] != this.getPlayerBoard()[1][j] && this.getPlayerBoard()[0][j] != this.getPlayerBoard()[2][j]) {
                check[j] = true;
            } else {
                check[j] = false;
            }
        }
        return check[0] && check[1] && check[2];
    }

    @Override
    public boolean matrixValidation(int board[][][], int mIndex, int rIndex, int cIndex, int attempt) {
        boolean[] check = new boolean[9];
        int ind = 0;
        for (int i = 0; i < (size); i++) {
            for (int j = 0; j < (size); j++) {
                if (board[mIndex][i][j] != attempt) { //Vai comparar a tentativa a todos os elementos da matrix
                    check[ind] = true;
                }
                ind++;
            }
        }
        if (check[0] == true && check[1] == true && check[2] == true && check[3] == true
                && check[4] == true && check[5] == true && check[6] == true && check[7] == true && check[8] == true) {
            board[mIndex][rIndex][cIndex] = attempt;
            return true;
        }
        return false;
    }

    //Methods that will be deleted when Grafic Interface gets build up.
    @Override
    public void showBoard(int pb[][][]) {
        System.out.println(pb[0][0][0] + " " + pb[0][0][1] + " " + pb[0][0][2] + " | " + pb[1][0][0] + " " + pb[1][0][1] + " " + pb[1][0][2] + " | " + pb[2][0][0] + " " + pb[2][0][1] + " " + pb[2][0][2]);
        System.out.println(pb[0][1][0] + " " + pb[0][1][1] + " " + pb[0][1][2] + " | " + pb[1][1][0] + " " + pb[1][1][1] + " " + pb[1][1][2] + " | " + pb[2][1][0] + " " + pb[2][1][1] + " " + pb[2][1][2]);
        System.out.println(pb[0][2][0] + " " + pb[0][2][1] + " " + pb[0][2][2] + " | " + pb[1][2][0] + " " + pb[1][2][1] + " " + pb[1][2][2] + " | " + pb[2][2][0] + " " + pb[2][2][1] + " " + pb[2][2][2]);
        System.out.println("------+-------+------");
        System.out.println(pb[3][0][0] + " " + pb[3][0][1] + " " + pb[3][0][2] + " | " + pb[4][0][0] + " " + pb[4][0][1] + " " + pb[4][0][2] + " | " + pb[5][0][0] + " " + pb[5][0][1] + " " + pb[5][0][2]);
        System.out.println(pb[3][1][0] + " " + pb[3][1][1] + " " + pb[3][1][2] + " | " + pb[4][1][0] + " " + pb[4][1][1] + " " + pb[4][1][2] + " | " + pb[5][1][0] + " " + pb[5][1][1] + " " + pb[5][1][2]);
        System.out.println(pb[3][2][0] + " " + pb[3][2][1] + " " + pb[3][2][2] + " | " + pb[4][2][0] + " " + pb[4][2][1] + " " + pb[4][2][2] + " | " + pb[5][2][0] + " " + pb[5][2][1] + " " + pb[5][2][2]);
        System.out.println("------+-------+------");
        System.out.println(pb[6][0][0] + " " + pb[6][0][1] + " " + pb[6][0][2] + " | " + pb[7][0][0] + " " + pb[7][0][1] + " " + pb[7][0][2] + " | " + pb[8][0][0] + " " + pb[8][0][1] + " " + pb[8][0][2]);
        System.out.println(pb[6][1][0] + " " + pb[6][1][1] + " " + pb[6][1][2] + " | " + pb[7][1][0] + " " + pb[7][1][1] + " " + pb[7][1][2] + " | " + pb[8][1][0] + " " + pb[8][1][1] + " " + pb[8][1][2]);
        System.out.println(pb[6][2][0] + " " + pb[6][2][1] + " " + pb[6][2][2] + " | " + pb[7][2][0] + " " + pb[7][2][1] + " " + pb[7][2][2] + " | " + pb[8][2][0] + " " + pb[8][2][1] + " " + pb[8][2][2]);
    }

    @Override
    public void testBoard() {
        //matrixValidation(this.answerBoard, 1, 3);
        insertValues(this.answerBoard);
        this.matrixValidation(answerBoard, 0, 2, 1, 8);
        this.matrixValidation(answerBoard, 0, 0, 0, 1);
        showBoard(this.getAnswerBoard());
    }

    public void insertValues(int pb[][][]) {
        for (int k = 0; k < pb.length; k++) {
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    pb[k][i][j] = k;
                }
            }
        }
    }
}
