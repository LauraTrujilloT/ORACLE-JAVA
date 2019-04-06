package classes;

import interface1.Atacar;
import interface1.Correr;
import interface1.Decapitar;

public class Ninja extends Personaje implements Correr, Atacar, Decapitar {

    @Override
    public void correr() {
        System.out.println("Correr como un Ninja");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lanzarShuriken() {
        System.out.println("Lanzar Shuriken como Ninja"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mocharCabeza() {
        System.out.println("Mochar cabeza como Ninja"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
