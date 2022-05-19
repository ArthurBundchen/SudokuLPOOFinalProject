package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */

public class Player {
    private String name;
    private int recorde; //How many seconds took for the player to finish.
    
    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public int getRecorde() {
        return recorde;
    }

    public void setRecorde(int recorde) {
        this.recorde = recorde;
    }
    
    
}
