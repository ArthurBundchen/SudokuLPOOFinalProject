package lpooprojectsudoku;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author arthur coimbra bundchen
 */
public class DecimalBoard extends Board {

    private static final int SIZE = 9;
    private boolean[][] pbLockedPosition = new boolean[SIZE][SIZE];
    private int[][] answerBoard = new int[SIZE][SIZE];
    public int[][] playerBoard = new int[][] {{2,0,5,  0,0,7,  0,0,6},
                                               {4,0,0,  9,6,0,  0,2,0},
                                               {0,0,0,  0,8,0,  0,4,5},
 
                                               {9,8,0,  0,7,4,  0,0,0},
                                               {5,7,0,  8,0,2,  0,6,9},
                                               {0,0,0,  6,3,0,  0,5,7},

                                               {7,5,0,  0,2,0,  0,0,0},
                                               {0,6,0,  0,5,1,  0,0,2},
                                               {3,0,0,  4,0,0,  5,0,8}};

    public DecimalBoard(int level) {
        super(level);
    }

    public boolean[][] getPbLockedPosition() {
        return pbLockedPosition;
    }

    public void setPlayerBoard(int[][] playerBoard) {
        this.playerBoard = playerBoard;
    }

    public int[][] getPlayerBoard() {
        return playerBoard;
    }

    //NEW
    public void setPbLockedPosition(){
        for(int row = 0; row < SIZE; row++){
            for(int column = 0; column < SIZE; column++){
                if(playerBoard[row][column] == 0){
                    pbLockedPosition[row][column] = true;
                }
            }
        }
    }
    
    public void setAttempt(int board[][], int row, int column, int attempt){
        if(attempt >= 1 && attempt <= SIZE){
            playerBoard[row][column] = attempt;
        }
    }
    
    public boolean isBoardFull(int board[][]) {
        int zeroCc = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (row == 0 && column == 0) {
                    zeroCc = 0;
                }
                if (board[row][column] == 0) {
                    zeroCc++;
                };
            }
        }
        if (zeroCc == 0) {
            return true;
        }
        return false;
    }
    
    public boolean hasWon(int board[][]){
        if(isBoardFull(board)){
            for (int row = 0; row < SIZE; row++) {
                for (int column = 0; column < SIZE; column++) {
                    if(board[row][column] == answerBoard[row][column]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean checkAll(int board[][], int rIndex, int cIndex, int attempt){
        return !checkOnRow(board, rIndex, attempt) && !checkOnColumn(board, cIndex, attempt) && !checkOnMatrix(board, rIndex, cIndex, attempt);
    }
    
    @Override
    public boolean checkOnRow(int board[][], int rIndex, int attempt) {
        for(int i = 0; i < SIZE; i++){
            if(board[rIndex][i] == attempt){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean checkOnColumn(int board[][], int cIndex, int attempt) {
        for(int i = 0; i < SIZE; i++){
            if(board[i][cIndex] == attempt){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkOnMatrix(int board[][],int rIndex, int cIndex, int attempt) {
        int matrixRow = rIndex  - (rIndex % 3);
        int matrixColumn = cIndex  - (cIndex % 3);
        
        for(int i = matrixRow; i < matrixRow + 3; i++){
            for(int j = matrixColumn; i < matrixColumn + 3; i++){
                if(board[i][j] == attempt){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void creatAswerBoard(int board[][]){
        for(int row = 0; row < SIZE; row++){
            for(int column = 0; column < SIZE; column++){
                answerBoard[row][column] = playerBoard[row][column];
            }
        }
        solveBoard(answerBoard);
    }
    
    public boolean solveBoard(int board[][]){
        for(int row = 0; row < SIZE; row++){
            for(int column = 0; column < SIZE; column++){
                if(board[row][column] == 0){
                    for(int numToTry = 1; numToTry <= SIZE; numToTry++){
                        if(checkAll(board, row, column, numToTry)){
                            board[row][column] = numToTry;
                            if(solveBoard(board)){
                                return true;
                            } else{
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    //Methods that will be deleted when Grafic Interface gets build up.
    @Override
    public void showBoard(int board[][]) {
        System.out.println("\n==================== SUDOKU ====================\n");
        System.out.println("\t    A B C  | D E F  | G H I");
        System.out.println("\t  ---------------------------");
        for(int row = 0; row < 9; row++){
            System.out.print("\t" + (row + 1) + " | ");
            for(int column = 0; column < 9; column++){
                System.out.print(board[row][column] + " ");
                if(column == 2 || column == 5){
                    System.out.print(" | ");
                }
                if(column == 8) {
                    System.out.print("|");
                }
            }
            System.out.println("");
            if(row == 2 || row == 5){
                System.out.println("\t  |--------+--------+-------|");
            }
        }
        System.out.println("\t  ---------------------------");
    }
   
}
