
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
        
        League theLeague = new League();
        //Creating Teams
        Team[] theTeams = createTeams();
       
        //Creating a GAME
        Game[] theGames = createGames(theTeams);
        
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
    
    public static Team[] createTeams(){
        String names[] = {"Falcao","Ronaldo","Messi","Cuadrado",
        "Mina", "Ribery", "Benzema","Podolsky","Lahm","Dybala","Neuer",
        "Trujillo","Taborda","Ospina","Zlatan","Iniesta"};
        Player[] players = new Player[11];
        
        for (int i = 0; i < 11; i++) {
            players[i] = new Player(names[new Random().nextInt(names.length)]);
            //players[i].setPlayerName(names[new Random().nextInt(names.length)]);
            //System.out.println(players[i].playerName);
        }
        
        Team team1 = new Team("Real Madrid", players);
        
        Player[] players2 = new Player[11];
        
        for (int i = 0; i < 11; i++) {
            players2[i] = new Player(names[new Random().nextInt(names.length)]);
        }   
        
        Team team2 = new Team("Bayern München", players2);
        
        Team[] theTeams = {team1, team2};
        return theTeams;
    }
    public static Game[] createGames(Team[] theTeams){
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }
    
    public void showBestTeam(Team[] theTeams){
        System.out.println("\n Team Points ");
        for (Team currTeam: theTeams){
            System.out.println(currTeam.getTeamName() + ": " 
                    +  currTeam.getPointsTotal());
        }
    }
}
