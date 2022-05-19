package lpooprojectsudoku;

import java.util.Random;

/**
 *
 * @author arthur coimbra bundchen
 */
public class HexadecimalBoard extends Board{
    
    private static final int SIZE = 16;
    private boolean[][] pbLockedPosition = new boolean[SIZE][SIZE];
    private int[][] playerBoard = new int[SIZE][SIZE];
    private int[][] answerBoard = new int[SIZE][SIZE];
    
    //Constructor
    public HexadecimalBoard(int level) {
        super(level);
    }
    
    //Getters & Setters
    public int getSIZE() {
        return SIZE;
    }

    public int[][] getAnswerBoard() {
        return answerBoard;
    }
    
    public boolean[][] getPbLockedPosition() {
        return pbLockedPosition;
    }
    
    public int[][] getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(int[][] playerBoard) {
        this.playerBoard = playerBoard;
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
    
    public void setAttempt(int board[][], int row, int column, int attempt){
        if(attempt >= 1 && attempt <= SIZE){
            playerBoard[row][column] = attempt;
        }
    }
    
    public boolean isBoardFull(int board[][]) {
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
    
    public void creatPlayerBoard(int board[][], int dificult){
        
        //Vai preencher todos os valores no playerBoard
        for (int row = 0; row < SIZE; row++) {
                for (int column = 0; column < SIZE; column++) {
                    this.playerBoard[row][column] = board[row][column];
            }
        }
        int blanks = 0;
        int row = 0, column = 0;
        Random rand = new Random();
        
        //Vai determinar de acordo com a dificuldade selecionada quantas celulas estarao vazias
        switch(dificult){
            case 1:
                blanks = 139;
                break;
            case 2:
                blanks = 162;
                break;
            case 3:
                blanks = 185;
                break;
            case 4:
                blanks = 162;
                break;
            default:
                break;
        }
        
        //Vai esvaziar determinada quantidade de celulas aleatoriamente
        while(blanks > 0){
            row = rand.nextInt(16);
            column = rand.nextInt(16);
            if(board[row][column] != 0){
                playerBoard[row][column] = 0;
                pbLockedPosition[row][column] = true;
                blanks--;
            }
        }
        
    }
    
    public void reSetPbLockedPosions(boolean state){
        for (int row = 0; row < SIZE; row++) {
                for (int column = 0; column < SIZE; column++) {
                    this.pbLockedPosition[row][column] = state;
            }
        }
    }
    
    public void crazySudoku(){
        this.answerBoard = rowSwitch(this.answerBoard);
        this.answerBoard = columnSwitch(this.answerBoard);
        reSetPbLockedPosions(false);
        creatPlayerBoard(this.answerBoard, 4);
        
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
    public void answerBoardCreator() {
        Random random = new Random();
        int mix = random.nextInt(400) + 100;
        int[][] inicialBoard = new int[][] {{12,  2,  5,  7,  4, 11,  9, 16,  6, 15, 10,  1, 13,  3,  8, 14}, 
                                            {15,  4, 10,  9, 12,  8,  2, 13, 14,  5,  3, 11, 16,  1,  7,  6}, 
                                            { 1, 11, 16, 13,  6, 14,  7,  3,  4,  9,  8,  2, 12,  5, 15, 10}, 
                                            {14,  8,  6,  3,  5, 15,  1, 10, 12,  7, 16, 13, 11,  9,  4,  2}, 
                                            {10,  7, 15,  2,  8, 12,  4,  9,  1,  6, 11,  5, 14, 13,  3, 16}, 
                                            { 3,  5,  9,  1, 11, 13, 15,  7,  2,  4, 14, 16,  8, 10,  6, 12},
                                            {13, 16, 11, 14,  2,  1,  3,  6,  8, 12, 15, 10,  7,  4,  5,  9}, 
                                            { 6, 12,  8,  4, 10, 16,  5, 14,  7, 13,  9,  3, 15,  2, 11,  1}, 
                                            { 2, 15,  1, 16,  3,  7, 12,  4,  5, 11,  6,  9, 10, 14, 13,  8},
                                            { 7,  6, 13,  8,  9,  2, 11,  5, 10, 14,  1, 12,  4, 15, 16,  3}, 
                                            { 4,  9,  3,  5, 15, 10, 14,  8, 16,  2, 13,  7,  6, 12,  1, 11}, 
                                            {11, 14, 12, 10, 16,  6, 13,  1,  3,  8,  4, 15,  9,  7,  2,  5},
                                            { 9,  1,  2, 15,  7,  4, 10, 12, 11, 16,  5,  6,  3,  8, 14, 13},
                                            { 8,  3,  7, 11, 14,  9,  6,  2, 13,  1, 12,  4,  5, 16, 10, 15},
                                            {16, 10,  4, 12, 13,  5,  8, 11, 15,  3,  2, 14,  1,  6,  9,  7},
                                            { 5, 13, 14,  6,  1,  3, 16, 15,  9, 10,  7,  8,  2, 11, 12,  4}};
        for(int i = 0; i < mix; i++){
            answerBoard = rowSwitch(inicialBoard);
            answerBoard = columnSwitch(answerBoard);
            answerBoard = groupRowSwitch(answerBoard);
            answerBoard = groupColumnSwitch(answerBoard);
        }
    }
    
    public int[][] rowSwitch(int[][] board){
        Random random = new Random();
        int[] helperArray = new int[SIZE];
        int rowOne = 0;
        int rowTwo = 0;
        for(int group = 0; group < SIZE; group += 4){
            //Misturar linhas entre as linhas 0, 1, 2 e 3 (group = 0)
            //Misturar linhas entre as linhas 4, 5, 6 e 7 (group = 4)
            //Misturar linhas entre as linhas 8, 9, 10, 11 (group = 8)
            //Misturar linhas entre as linhas 12, 13, 14, 15 (group = 12)
            
            do{
            //Garante que rowOne e rowTwo sempre sejam diferentes
            rowOne = random.nextInt(4);
            rowTwo = random.nextInt(4);
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
        for(int group = 0; group < SIZE; group += 4){
            //Misturar colunas entre as colunas 0, 1, 2 e 3 (group = 0)
            //Misturar colunas entre as colunas 4, 5, 6 e 7 (group = 4)
            //Misturar colunas entre as colunas 8, 9, 10, 11 (group = 8)
            //Misturar linhas entre as colunas 12, 13, 14, 15 (group = 12)
            
            do{
            //Garante que rowOne e rowTwo sempre sejam diferentes
            columnOne = random.nextInt(4);
            columnTwo = random.nextInt(4);
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
        int[][] helperThreeRow = new int[4][SIZE];
        int groupOne = 0;
        int groupTwo = 0;
        do {
            //Garante que groupOne e groupTwo sempre sejam diferentes
            groupOne = (random.nextInt(4) * 4); //0, 4, 8 ou 12
            groupTwo = (random.nextInt(4) * 4); //0, 4, 8 ou 12
        } while (groupOne == groupTwo);

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < SIZE; column++) {
                helperThreeRow[row][column] = board[groupTwo + row][column]; //helperThreeRow recebe 3 linhas de groupTwo
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < SIZE; column++) {
                board[groupTwo + row][column] = board[groupOne + row][column]; //groupTwo recebe 3 linhas de groupOne
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < SIZE; column++) {
                board[groupOne + row][column] = helperThreeRow[row][column]; //groupOne recebe 3 linhas de helperThreeRow
            }
        }
        return board;
    }
    
    public int[][] groupColumnSwitch(int[][] board){
        Random random = new Random();
        int[][] helperThreeColumn = new int[SIZE][4];
        int groupOne = 0;
        int groupTwo = 0;
        do {
            //Garante que groupOne e groupTwo sempre sejam diferentes
            groupOne = (random.nextInt(4) * 4); //0, 4, 8 ou 12
            groupTwo = (random.nextInt(4) * 4); //0, 4, 8 ou 12
        } while (groupOne == groupTwo);

        for (int column = 0; column < 4; column++) {
            for (int row = 0; row < SIZE; row++) {
                helperThreeColumn[row][column] = board[row][groupTwo + column]; //helperThreeRow recebe 4 colunas de groupTwo
            }
        }
        for (int column = 0; column < 4; column++) {
            for (int row = 0; row < SIZE; row++) {
                board[row][groupTwo + column] = board[row][groupOne + column]; //groupTwo recebe 4 colunas de groupOne
            }
        }
        for (int column = 0; column < 4; column++) {
            for (int row = 0; row < SIZE; row++) {
                board[row][groupOne + column] = helperThreeColumn[row][column]; //groupOne recebe 4 colunas de helperThreeRow
            }
        }
        return board;
    }
    
    public int[] availableNumbers(int[][]board, int row, int column){
        int[] available = new int[SIZE];
        for(int numToTry = 1; numToTry <= SIZE; numToTry++){
            if(checkAll(board, row, column, numToTry)){
                available[numToTry - 1] = numToTry;
            }
        }
        return available;
    }
        
    //Methods inherited from superclass Board
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
        int matrixRow = rIndex  - (rIndex % 4);
        int matrixColumn = cIndex  - (cIndex % 4);
        
        for(int i = matrixRow; i < matrixRow + 4; i++){
            for(int j = matrixColumn; j < matrixColumn + 4; j++){
                if(board[i][j] == attempt){
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void showBoard(int board[][]) {
        System.out.println("\n============================= SUDOKU =============================\n");
        System.out.println("      A  B  C  D  |  E  F  G  H  |  I  J  K  L  |  M  N  O  P");
        System.out.println("    ----------------------------------------------------------");
        for(int row = 0; row < SIZE; row++){
            if(row <= 8){
                System.out.print(" ");
            }
            System.out.print((row + 1) + " | ");
            for(int column = 0; column < SIZE; column++){
                if(board[row][column] < 10){
                    System.out.print(" ");
                }
                System.out.print(board[row][column] + " ");
                if(column == 3 || column == 7 || column == 11){
                    System.out.print(" | ");
                }
                if(column == 15) {
                    System.out.println("|");
                }
            }
            
            if(row == 3 || row == 7 || row == 11){
                System.out.println("   |--------------+--------------+--------------+-------------|");
            }
        }
        System.out.println("    ----------------------------------------------------------");
    }

}
