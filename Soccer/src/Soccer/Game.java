
package Soccer;

import java.util.Random;
import utility.GameUtils;

/**
 *
 * @author lvtrujillot@unal.edu.co
 */
public class Game {
    /*
    Attributes homTeam and vsTeam for the game. 
    Another attribute as an Array of Goals marked
    */
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(){
       int numberOfGoals = new Random().nextInt(7);
       Goal[] theGoals = new Goal[numberOfGoals]; 
       this.goals = theGoals;
       GameUtils.addGameGoals(this);
    }
    StringBuilder returnString = new StringBuilder();
    public String getDescription(){
        for(Goal currGoal: this.goals){
            returnString.append("Goals scored after "+ currGoal.theTime + 
                " mins by " + currGoal.thePlayer.playerName + " of "+
                currGoal.theTeam.teamName + "\n");        
        }  
    return returnString.toString();
    }

}
