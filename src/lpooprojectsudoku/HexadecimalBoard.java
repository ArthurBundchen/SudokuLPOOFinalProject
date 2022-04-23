package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */
public class HexadecimalBoard extends Board{
    
    private final int size = 4;
    private int[][][] playerBoard = new int[size*size][size][size];
    private int[][][] answerBoard = new int[size*size][size][size];

    public HexadecimalBoard(int level) {
        super(level);
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
    public boolean rowsValidation(int board[][][], int mIndex, int rIndex, int cIndex, int attempt) {
        return true;
    }

    @Override
    public boolean columnsValidation(int board[][][], int mIndex, int rIndex, int cIndex, int attempt) {
        return true;
    }

    @Override
    public boolean matrixValidation(int board[][][], int mIndex, int rIndex, int cIndex, int attempt) {
        return true;
    }

    //Methods that will be deleted when Grafic Interface gets build up.
    @Override
    public void showBoard(int[][][] pb) {
        for(int k = 0; k < pb.length; k++){
            for(int i = 0; i < this.size; i++){
                for(int j = 0; j < this.size; j++){
                    pb[k][i][j] = k;
                }
            }
        }
        
        System.out.println(pb[0][0][0] + " " + pb[0][0][1] + " " + pb[0][0][2] + " " + pb[0][0][3] + " | " + pb[1][0][0] + " " + pb[1][0][1] + " " + pb[1][0][2] + " " + pb[1][0][3] + " | " + pb[2][0][0] + " " + pb[2][0][1] + " " + pb[2][0][2] + " " + pb[2][0][3]);
        System.out.println(pb[0][1][0] + " " + pb[0][1][1] + " " + pb[0][1][2] + " " + pb[0][1][3] + " | " + pb[1][1][0] + " " + pb[1][1][1] + " " + pb[1][1][2] + " " + pb[1][1][3] + " | " + pb[2][1][0] + " " + pb[2][1][1] + " " + pb[2][1][2] + " " + pb[2][1][3]);
        System.out.println(pb[0][2][0] + " " + pb[0][2][1] + " " + pb[0][2][2] + " " + pb[0][2][3] + " | " + pb[1][2][0] + " " + pb[1][2][1] + " " + pb[1][2][2] + " " + pb[1][2][3] + " | " + pb[2][2][0] + " " + pb[2][2][1] + " " + pb[2][2][2] + " " + pb[2][2][3]);
        System.out.println(pb[0][3][0] + " " + pb[0][3][1] + " " + pb[0][3][2] + " " + pb[0][3][3] + " | " + pb[1][3][0] + " " + pb[1][3][1] + " " + pb[1][3][2] + " " + pb[1][3][3] + " | " + pb[2][3][0] + " " + pb[2][3][1] + " " + pb[2][3][2] + " " + pb[2][3][3]);
        System.out.println("--------+---------+--------");
        System.out.println(pb[3][0][0] + " " + pb[3][0][1] + " " + pb[3][0][2] + " " + pb[3][0][3] + " | " + pb[4][0][0] + " " + pb[4][0][1] + " " + pb[4][0][2] + " " + pb[4][0][3] + " | " + pb[5][0][0] + " " + pb[5][0][1] + " " + pb[5][0][2] + " " + pb[5][0][3]);
        System.out.println(pb[3][1][0] + " " + pb[3][1][1] + " " + pb[3][1][2] + " " + pb[3][1][3] + " | " + pb[4][1][0] + " " + pb[4][1][1] + " " + pb[4][1][2] + " " + pb[4][1][3] + " | " + pb[5][1][0] + " " + pb[5][1][1] + " " + pb[5][1][2] + " " + pb[5][1][3]);
        System.out.println(pb[3][2][0] + " " + pb[3][2][1] + " " + pb[3][2][2] + " " + pb[3][2][3] + " | " + pb[4][2][0] + " " + pb[4][2][1] + " " + pb[4][2][2] + " " + pb[4][2][3] + " | " + pb[5][2][0] + " " + pb[5][2][1] + " " + pb[5][2][2] + " " + pb[5][2][3]);
        System.out.println(pb[3][3][0] + " " + pb[3][3][1] + " " + pb[3][3][2] + " " + pb[3][3][3] + " | " + pb[4][3][0] + " " + pb[4][3][1] + " " + pb[4][3][2] + " " + pb[4][3][3] + " | " + pb[5][3][0] + " " + pb[5][3][1] + " " + pb[5][3][2] + " " + pb[5][3][3]);
        System.out.println("--------+---------+--------");
        System.out.println(pb[6][0][0] + " " + pb[6][0][1] + " " + pb[6][0][2] + " " + pb[6][0][3] + " | " + pb[7][0][0] + " " + pb[7][0][1] + " " + pb[7][0][2] + " " + pb[7][0][3] + " | " + pb[8][0][0] + " " + pb[8][0][1] + " " + pb[8][0][2] + " " + pb[8][0][3]);
        System.out.println(pb[6][1][0] + " " + pb[6][1][1] + " " + pb[6][1][2] + " " + pb[6][1][3] + " | " + pb[7][1][0] + " " + pb[7][1][1] + " " + pb[7][1][2] + " " + pb[7][1][3] + " | " + pb[8][1][0] + " " + pb[8][1][1] + " " + pb[8][1][2] + " " + pb[8][1][3]);
        System.out.println(pb[6][2][0] + " " + pb[6][2][1] + " " + pb[6][2][2] + " " + pb[6][2][3] + " | " + pb[7][2][0] + " " + pb[7][2][1] + " " + pb[7][2][2] + " " + pb[7][2][3] + " | " + pb[8][2][0] + " " + pb[8][2][1] + " " + pb[8][2][2] + " " + pb[8][2][3]);
        System.out.println(pb[6][3][0] + " " + pb[6][3][1] + " " + pb[6][3][2] + " " + pb[6][3][3] + " | " + pb[7][3][0] + " " + pb[7][3][1] + " " + pb[7][3][2] + " " + pb[7][3][3] + " | " + pb[8][3][0] + " " + pb[8][3][1] + " " + pb[8][3][2] + " " + pb[8][3][3]);
    }
    
    @Override
    public void testBoard() {
        showBoard(this.getAnswerBoard());
    }
    
}
