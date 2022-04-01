package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */

public abstract class Board {
    private int size = 3;
    private int level;
    private boolean ready;
    private int[][] playerBoard = new int[size*size][size*size];
    private int[][] answerBoard = new int[size*size][size*size];
    
    //Constructor
    public Board(int size, int level) {
        this.setSize(size);
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    //Normal Methods
    public abstract void creatAnswerBoard();
    
    public abstract void showBoard();
    
    public abstract void addAttempt(int array[][]);
    
    public abstract void isTryRight(int attempt,int array[][]);
    
    public abstract boolean rowsValidation(int attempt);
    
    public abstract boolean linesValidation(int attempt);
    
    public abstract boolean matrixValidation(int attempt);
}