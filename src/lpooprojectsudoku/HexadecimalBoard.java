package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */
public class HexadecimalBoard extends Board{
    
    private static final int SIZE = 16;
    private int[][] playerBoard = new int[SIZE][SIZE];

    public HexadecimalBoard(int level) {
        super(level);
    }
    
    public int[][] getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(int[][] playerBoard) {
        this.playerBoard = playerBoard;
    }

    //NEW
    //@Override
    public boolean checkAll(int board[][], int rIndex, int cIndex, int attempt){
        return !checkOnRow(board, rIndex, attempt) && !checkOnColumn(board, cIndex, attempt) && !checkOnMatrix(board, rIndex, cIndex, attempt);
    }
    
    //@Override
    public boolean checkOnRow(int board[][], int rIndex, int attempt) {
        return true;
    }
    
    //@Override
    public boolean checkOnColumn(int board[][], int cIndex, int attempt) {
        return true;
    }

    //@Override
    public boolean checkOnMatrix(int board[][],int rIndex, int cIndex, int attempt) {
        return true;
    }
    
    public boolean solveBoard(int board[][]){
        return true;
    }
    
    //Methods that will be deleted when Grafic Interface gets build up.
    //@Override
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

    @Override
    public void testBoard() {
        
    } 
}
