package classes;

import interface1.Correr;
import interface1.Decapitar;

public class Samurai extends Personaje implements Correr, Decapitar{

    @Override
    public void correr() {
        System.out.println("Correr como Samurai");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mocharCabeza() {
        System.out.println("Mocha cabeza como Samurai"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
