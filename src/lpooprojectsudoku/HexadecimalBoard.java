package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */
public class HexadecimalBoard extends Board{
    
    private static final int SIZE = 16;
    private boolean[][] pbLockedPosition = new boolean[SIZE][SIZE];
    private int[][] playerBoard = new int[SIZE][SIZE];

    public HexadecimalBoard(int level) {
        super(level);
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
    
    public boolean hasWon(){
        if(isBoardFull(playerBoard)){
            for (int row = 0; row < SIZE; row++) {
                for (int column = 0; column < SIZE; column++) {
                    if(checkAll(playerBoard, row, column, playerBoard[row][column])){
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
        int matrixRow = rIndex  - (rIndex % 4);
        int matrixColumn = cIndex  - (cIndex % 4);
        
        for(int i = matrixRow; i < matrixRow + 4; i++){
            for(int j = matrixColumn; i < matrixColumn + 4; i++){
                if(board[i][j] == attempt){
                    return true;
                }
            }
        }
        return false;
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
        for(int row = 0; row < SIZE; row++){
            for(int column = 0; column < SIZE; column++){
                System.out.print(board[row][column] + " ");
                if(column == 3 || column == 7){
                    System.out.print(" | ");
                }
            }
            System.out.println("");
            if(row == 3 || row == 7){
                System.out.println("------------------------");
            }
        }    
    }

}
