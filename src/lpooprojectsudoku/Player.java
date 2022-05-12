package lpooprojectsudoku;

/**
 *
 * @author arthur coimbra bundchen
 */

public class Player {
    private String firstName;
    private String lastName;
    private int recorde; //How many seconds took for the player to finish.
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRecorde() {
        return recorde;
    }

    public void setRecorde(int recorde) {
        this.recorde = recorde;
    }
    
    
}
