
package Soccer;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import utility.GameUtils;
import utility.PlayerDataBase;

/**
 *
 * @author lvtrujillot@unal.edu.co
 */
public class League {
    /*
    Here's where both teams start to play and goals are marked.
    */
    public static void main(String[] args) {
        
        League theLeague = new League();
        //Creating Teams
        Team[] theTeams = theLeague.createTeams("Real Madrid, Bayern München, FC Barcelona", 7);
        //LIMIT 8
       
        //Creating a GAME
        Game[] theGames = theLeague.createGames(theTeams);
        
        for(Game currGame: theGames){
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        
        theLeague.showBestTeam(theTeams);
        /*
        //Searching for a PLAYER
        for(Player thePlayer: theTeams[0].playerArray){
            if (thePlayer.playerName.matches(".*Ro.*")){
                System.out.println("Found "+thePlayer.playerName);
            }
        }
        */
        
    }
    //Creating methods
    
    public Team[] createTeams(String teamNames, int teamSize){ 
        PlayerDataBase playerDB = new PlayerDataBase();
        StringTokenizer teamNameTokens =  new StringTokenizer(teamNames, ",");
        
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        
        for (int i = 0 ; i < theTeams.length; i++){
            theTeams[i] = new Team (teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }        
        return theTeams;
    }
    public  Game[] createGames(Team[] theTeams){
        ArrayList<Game> theGames = new ArrayList();
        for(Team homeTeam: theTeams){
            for(Team awayTeam: theTeams){
                if (homeTeam != awayTeam){
                    theGames.add(new Game(homeTeam, awayTeam));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }
    
    public void showBestTeam(Team[] theTeams){
        Team currBestTeam = theTeams[0];
        System.out.println("\n Team Points ");
        for (Team currTeam: theTeams){
           if(currTeam.getPointsTotal() > currBestTeam.getPointsTotal()){
               currBestTeam = currTeam;
           }else if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
               currBestTeam = currTeam;
           }
            
            System.out.println("\n --------\n"+currTeam.getTeamName() + ": " 
                    +  currTeam.getPointsTotal() + "\n (Goals scored: "
                    + currTeam.getGoalsTotal()+")" );
        }
        System.out.println("\n LEAGUE CHAMPION: "+ currBestTeam.getTeamName());
    }
}
