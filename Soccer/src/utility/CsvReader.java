
package utility;

import Soccer.Player;
 import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author ltt
 */
public class CsvReader {
    
    public  ArrayList<String> CsvReader() throws FileNotFoundException, IOException {

        String csvFile = "/home/ltt/Downloads/data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> players = new ArrayList();
        
        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] name = line.split(cvsSplitBy);
                Datos a = new Datos();
                a.setNombre(name[0]);
                a.setDireccion(name[1]);
                players.add(a);
                //System.out.println( name[3] );
        }
        return players;
    }

}
