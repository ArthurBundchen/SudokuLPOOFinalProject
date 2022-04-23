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
    public abstract void creatAnswerBoard();
    
    public abstract void addAttempt(int array[][][]);
    
    public abstract void isTryRight(int attempt,int array[][][]);
    
    public abstract boolean rowsValidation();
    
    public abstract boolean columnsValidation();
    
    public abstract boolean matrixValidation(int board[][][], int mIndex, int rIndex, int cIndex, int attempt);
    
    //Methods that will be deleted when Grafic Interface gets build up.
    public abstract void showBoard(int[][][] pb);
    
    public abstract void testBoard();
}