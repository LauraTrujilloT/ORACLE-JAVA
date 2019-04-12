
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
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    //Constructors
    
    public Game(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    public Game(){}
    
    public void playGame(){
       int numberOfGoals = new Random().nextInt(7);
       Goal[] theGoals = new Goal[numberOfGoals]; 
       this.setGoals(theGoals);
       GameUtils.addGameGoals(this);
    }
    
    
    public String getDescription(){
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        returnString.append("\n"+homeTeam.getTeamName() + " vs. " +
                awayTeam.getTeamName() + "\n");
        
        for(Goal currGoal: this.getGoals()){
            if (currGoal.getTheTeam() == homeTeam){
                homeTeamGoals++;
            } else {awayTeamGoals++;}
            
            returnString.append("Goals scored after "+ currGoal.getTheTime() + 
                " mins by " + currGoal.getThePlayer().getPlayerName() + " of "+
                    currGoal.getTheTeam().getTeamName() + "\n");        
        }  
        
        if (homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        }else if (homeTeamGoals > awayTeamGoals){
            returnString.append("\n"+homeTeam.getTeamName()+" WON!!");
            homeTeam.incPointsTotal(2);
            awayTeam.incPointsTotal(0);
        }else {
            returnString.append("\n"+awayTeam.getTeamName() + " WON!!");
            homeTeam.incPointsTotal(0);
            awayTeam.incPointsTotal(2);
        }

    return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

}
