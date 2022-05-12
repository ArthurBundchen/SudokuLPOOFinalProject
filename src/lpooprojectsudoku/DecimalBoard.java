package lpooprojectsudoku;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author arthur coimbra bundchen
 */
public class DecimalBoard extends Board {

    private static final int SIZE = 9;
    public static int[][] playerBoard = new int[][] {{2,0,5,  0,0,7,  0,0,6},
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

    //NEW
    public static void setAttempt(int board[][], int row, int column, int attempt){
        if(attempt > 0 && attempt < 10){
            playerBoard[row][column] = attempt;
        }
    }
    
    public static boolean isBoardFull(int board[][]) {
        int zeroCc = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 0 && j == 0) {
                    zeroCc = 0;
                }
                if (board[i][j] == 0) {
                    zeroCc++;
                };
            }
        }
        if (zeroCc == 0) {
            return true;
        }
        return false;
    }
    //@Override
    public static boolean checkAll(int board[][], int rIndex, int cIndex, int attempt){
        return !checkOnRow(board, rIndex, attempt) && !checkOnColumn(board, cIndex, attempt) && !checkOnMatrix(board, rIndex, cIndex, attempt);
    }
    
    //@Override
    public static boolean checkOnRow(int board[][], int rIndex, int attempt) {
        for(int i = 0; i < 9; i++){
            if(board[rIndex][i]== attempt){
                return true;
            }
        }
        return false;
    }
    
    //@Override
    public static boolean checkOnColumn(int board[][], int cIndex, int attempt) {
        for(int i = 0; i < 9; i++){
            if(board[i][cIndex]== attempt){
                return true;
            }
        }
        return false;
    }

    //@Override
    public static boolean checkOnMatrix(int board[][],int rIndex, int cIndex, int attempt) {
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
    
    public boolean solveBoard(int board[][]){
        for(int row = 0; row < 9; row++){
            for(int column = 0; column < 9; column++){
                if(board[row][column] == 0){
                    for(int numToTry = 1; numToTry < 10; numToTry++){
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
    //@Override
    public static void showBoard(int board[][]) {
        System.out.println("\t   a b c  | d e f  | g h i");
        System.out.println("\t |-------------------------|");
        for(int row = 0; row < 9; row++){
            System.out.print("\t" + (row + 1) + "| ");
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
                System.out.println("\t |-------------------------|");
            }
        }
        System.out.println("\t |-------------------------|");
    }

    @Override
    public void testBoard() {
        //insertValues(this.answerBoard);
        
        showBoard(playerBoard);
        //solveBoard(playerBoard);
        //System.out.println("\n=======================\n");
        //showBoard(playerBoard);
        //this.isTryRight(answerBoard, 0, 0, 0, 1);
        //this.creatAnswerBoard();
    }    
}
