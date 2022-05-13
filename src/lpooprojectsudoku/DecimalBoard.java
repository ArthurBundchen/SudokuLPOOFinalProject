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
    private int[][] playerBoard = new int[SIZE][SIZE];

    //Constructor
    public DecimalBoard(int level) {
        super(level);
        answerBoardCreator();
    }

    //Getters & Setters

    public int[][] getAnswerBoard() {
        return answerBoard;
    }

    public void setPlayerBoard(int[][] playerBoard) {
        this.playerBoard = playerBoard;
    }

    public int[][] getPlayerBoard() {
        return playerBoard;
    }

    public void setPbLockedPosition(){
        for(int row = 0; row < SIZE; row++){
            for(int column = 0; column < SIZE; column++){
                if(playerBoard[row][column] == 0){
                    pbLockedPosition[row][column] = true;
                }
            }
        }
    }
    
    public boolean[][] getPbLockedPosition() {
        return pbLockedPosition;
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
    
    public void creatPlayerBoard(int board[][]){
        
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
    
    //Methods to creat answerBoard
    
    public int[][] answerBoardCreator() {
        Random random = new Random();
        int mix = random.nextInt(1000) + 100;
        solveBoard(answerBoard);
        for(int i = 0; i < mix; i++){
            answerBoard = rowSwitch(answerBoard);
            answerBoard = columnSwitch(answerBoard);
            answerBoard = groupRowSwitch(answerBoard);
            answerBoard = groupColumnSwitch(answerBoard);
        }
        return answerBoard;
    }
    
    public int[][] rowSwitch(int[][] board){
        Random random = new Random();
        int[] helperArray = new int[SIZE];
        int rowOne = 0;
        int rowTwo = 0;
        for(int group = 0; group < SIZE; group += 3){
            //Misturar linhas entre as linhas 0, 1 e 2 (group = 0)
            //Misturar linhas entre as linhas 3, 4 e 5 (group = 3)
            //Misturar linhas entre as linhas 6, 7 e 8 (group = 6)
            
            do{
            //Garante que rowOne e rowTwo sempre sejam diferentes
            rowOne = random.nextInt(3);
            rowTwo = random.nextInt(3);
            } while(rowOne == rowTwo);
            
            for(int column = 0; column < SIZE; column++){
                //Faz a troca das linhas
                helperArray[column] = board[rowTwo + group][column]; // helper recebe rowTwo
                board[rowTwo + group][column] = board[rowOne + group][column]; //rowTwo recebe rowOne
                board[rowOne + group][column] = helperArray[column];// rowOne recebe helper
            }
        }
        return board;
    }
    
    public int[][] columnSwitch(int[][] board){
        Random random = new Random();
        int[] helperArray = new int[SIZE];
        int columnOne = 0;
        int columnTwo = 0;
        for(int group = 0; group < SIZE; group += 3){
            //Misturar colunas entre as colunas 0, 1 e 2 (group = 0)
            //Misturar colunas entre as colunas 3, 4 e 5 (group = 3)
            //Misturar colunas entre as colunas 6, 7 e 8 (group = 6)
            
            do{
            //Garante que rowOne e rowTwo sempre sejam diferentes
            columnOne = random.nextInt(3);
            columnTwo = random.nextInt(3);
            } while(columnOne == columnTwo);
            
            for(int row = 0; row < SIZE; row++){
                //Faz a troca das colunas
                helperArray[row] = board[row][columnTwo + group]; // helper recebe columnTwo
                board[row][columnTwo + group] = board[row][columnOne + group]; //columnTwo recebe columnOne
                board[row][columnOne + group] = helperArray[row];// columnOne recebe helper
            }
        }
        return board;
    }
    
    public int[][] groupRowSwitch(int[][] board){
        Random random = new Random();
        int[][] helperThreeRow = new int[3][SIZE];
        int groupOne = 0;
        int groupTwo = 0;
        do {
            //Garante que groupOne e groupTwo sempre sejam diferentes
            groupOne = (random.nextInt(3) * 3); //0, 3 ou 6
            groupTwo = (random.nextInt(3) * 3); //0, 3 ou 6
        } while (groupOne == groupTwo);

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < SIZE; column++) {
                helperThreeRow[row][column] = board[groupTwo + row][column]; //helperThreeRow recebe 3 linhas de groupTwo
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < SIZE; column++) {
                board[groupTwo + row][column] = board[groupOne + row][column]; //groupTwo recebe 3 linhas de groupOne
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < SIZE; column++) {
                board[groupOne + row][column] = helperThreeRow[row][column]; //groupOne recebe 3 linhas de helperThreeRow
            }
        }
        return board;
    }
    
    public int[][] groupColumnSwitch(int[][] board){
        Random random = new Random();
        int[][] helperThreeColumn = new int[SIZE][3];
        int groupOne = 0;
        int groupTwo = 0;
        do {
            //Garante que groupOne e groupTwo sempre sejam diferentes
            groupOne = (random.nextInt(3) * 3); //0, 3 ou 6
            groupTwo = (random.nextInt(3) * 3); //0, 3 ou 6
        } while (groupOne == groupTwo);

        for (int column = 0; column < 3; column++) {
            for (int row = 0; row < SIZE; row++) {
                helperThreeColumn[row][column] = board[row][groupTwo + column]; //helperThreeRow recebe 3 colunas de groupTwo
            }
        }
        for (int column = 0; column < 3; column++) {
            for (int row = 0; row < SIZE; row++) {
                board[row][groupTwo + column] = board[row][groupOne + column]; //groupTwo recebe 3 colunas de groupOne
            }
        }
        for (int column = 0; column < 3; column++) {
            for (int row = 0; row < SIZE; row++) {
                board[row][groupOne + column] = helperThreeColumn[row][column]; //groupOne recebe 3 colunas de helperThreeRow
            }
        }
        return board;
    }
    
    //Metodos herdados da superclasse Board
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
