package utility;

import Soccer.Player;
import java.util.*;


/**
 *
 * @author ltt
 */
public class PlayerDataBase {
    private ArrayList<Player> players;
 
    String names[] = {"Falcao ", "Ronaldo","Messi","Cuadrado",
        "Mina", "Ribery", "Benzema","Podolsky","Lahm","Dybala","Neuer",
        "Trujillo","Taborda","Ospina","Zlatan","Iniesta" };
   
    
 //Constructors
    public PlayerDataBase(){
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        players = new ArrayList();    
     ///*
        for(int n = 0; n < names.length ; n++){
            players.add(new Player(names[n]));
        }
      // */
     /*
        while(authorTokens.hasMoreTokens()) {
            players.add(new Player(authorTokens.nextToken()));
            
        }
*/
    }
    
    //METHODS
    public Player[] getTeam(int numberOfPlayers){
            Player[] teamPlayers = new Player[numberOfPlayers];
            
            for (int i = 0 ; i  < numberOfPlayers; i++ ){
                int playerIndex =  new Random().nextInt(teamPlayers.length);
                teamPlayers[i] = players.get(playerIndex);
                players.remove(playerIndex);
            }
            return teamPlayers;
            }
    
    
    
String authorList = 
"Falcao," + 
"Ronaldo," +
"Benzema," +
"Ribery," +
"Ospina," +
"Messi," +          
"Dybala," +      
"Cuadrado," +
"Mina," +
"Neuer," +    
"Lahm," +
"Podolsky," +
"Zlatan," +
"Modrić," +        
"Mandzukić," +
"Rakitić," +
"Lewandosky," +
"Trujillo," +
"Taborda," +
"Eusse," +        
"J. M. Synge," + 
"J. R. Tolkien," +
"Jane Austin," +
"Leo Tolstoy," +
"Liam O'Flaherty," +
"Marcel Proust," +
"Mark Twain," +
"Oscar Wilde," +
"O. Henry," +
"Samuel Beckett," +
"Sean O'Casey," +
"William Shakespeare," +        
"William Makepeace Thackeray," +
"W. B. Yeats," +
"Wilkie Collins";
    
 
}
