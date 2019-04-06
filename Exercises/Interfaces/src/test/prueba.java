package test;

import classes.Ninja;
import classes.Samurai;
import interface1.Correr;
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        ArrayList<Correr> losqueCorren = new ArrayList<Correr>();
        
        losqueCorren.add(new Samurai());
        losqueCorren.add(new Ninja());
        
        for(Correr correr : losqueCorren){
            System.out.println(correr);
            correr.correr();
        }
    }
}
