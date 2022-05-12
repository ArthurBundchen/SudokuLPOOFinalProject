package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */

public abstract class Board {
    private int level;
    private boolean ready;
    
    //Constructor
    public Board(int level) {
        this.setLevel(level);
    }
       
    //Getters and Setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level > 0 && level < 4){
            this.level = level;
        }
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    //Normal Methods    
    public abstract boolean checkAll(int board[][], int rIndex, int cIndex, int attempt);
    
    public abstract boolean checkOnRow(int board[][], int rIndex, int attempt);
    
    public abstract boolean checkOnColumn(int board[][], int cIndex, int attempt);
    
    public abstract boolean checkOnMatrix(int board[][],int rIndex, int cIndex, int attempt);
    
    //Methods that will be deleted when Grafic Interface gets build up.
    public abstract void showBoard(int board[][]);
    
    public abstract void testBoard();
}