
package Soccer;

/**
 *
 * @author lvtrujillot@unal.edu.co
 */
public class Player {
   

  
    private String playerName;
    
    //Constructor
    public Player(String playerName){
        this.playerName = playerName;
    }
    
    public Player(){}
    
    public String getPlayerName() {
     /**
     * @return the playerName
     */
        return playerName;
    }


    public void setPlayerName(String playerName) {
     /**
     * @param playerName the playerName to set
     */
        this.playerName = playerName;
    }
   
}
