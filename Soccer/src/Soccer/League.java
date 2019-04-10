
package Soccer;

import java.util.Random;
import utility.GameUtils;

/**
 *
 * @author lvtrujillot@unal.edu.co
 */
public class League {
    /*
    Here's where both teams start to play and goals are marked.
    */
    public static void main(String[] args) {
        //Creating Teams
        Team[] theTeams = createTeams();
       
        //Creating a GAME
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
        currGame.playGame();
        
        
        //Searching for a PLAYER
        for(Player thePlayer: theTeams[0].playerArray){
            if (thePlayer.playerName.matches(".*Ro.*")){
                System.out.println("Found "+thePlayer.playerName);
            }
        }
        
        
    System.out.println(currGame.getDescription());  
    }
    //Creating methods
    
    public static Team[] createTeams(){
        String names[] = {"Falcao","Ronaldo","Messi","Cuadrado",
        "Mina", "Ribery", "Benzema","Podolsky","Lahm","Dybala","Neuer",
        "Trujillo","Taborda","Ospina","Zlatan","Iniesta"};
        Player[] players = new Player[11];
        
        for (int i = 0; i < 11; i++) {
            players[i] = new Player();
            players[i].playerName = names[new Random().nextInt(names.length)];
            //System.out.println(players[i].playerName);
        }
        
        Team team1 = new Team();
        team1.teamName = "Real Madrid";
        team1.playerArray = players;
        
        Player[] players2 = new Player[11];
        
        for (int i = 0; i < 11; i++) {
            players2[i] = new Player();
            players2[i].playerName = names[new Random().nextInt(names.length)];
            //System.out.println(players[i].playerName);
        }   
        Team team2 = new Team();
        team2.teamName = "Bayern München";
        team2.playerArray = players2;
        
        Team[] theTeams = {team1, team2};
        return theTeams;
    }
    public static Game[] createGames(Team[] theTeams){
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        
        Game[] theGames = {theGame};
        return theGames;
    }
    
}
