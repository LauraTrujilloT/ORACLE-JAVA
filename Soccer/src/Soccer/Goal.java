
package Soccer;

/**
 *
 * @author lvtrujillot@unal.edu.co
 */
public class Goal {

    /**
     * @return the theTeam
     */
    public Team getTheTeam() {
        return theTeam;
    }

    /**
     * @param theTeam the theTeam to set
     */
    public void setTheTeam(Team theTeam) {
        this.theTeam = theTeam;
    }

    /**
     * @return the thePlayer
     */
    public Player getThePlayer() {
        return thePlayer;
    }

    /**
     * @param thePlayer the thePlayer to set
     */
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    /**
     * @return the theTime
     */
    public double getTheTime() {
        return theTime;
    }

    /**
     * @param theTime the theTime to set
     */
    public void setTheTime(double theTime) {
        this.theTime = theTime;
    }
    /*
    Attributes from Team, Player. Attribute double for time of the game.
    This is created bc is necessary to know when marking a goal:
    whose team marked and who did it at what time 
    */
    private Team theTeam; 
    private Player thePlayer; 
    private double theTime; 
    
}
