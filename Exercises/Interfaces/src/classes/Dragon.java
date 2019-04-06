package classes;

import interface1.LanzarFuego;

public class Dragon extends Personaje implements LanzarFuego{

    @Override
    public void lanzarBolaDeFuego() {
        System.out.println("Lanza bola de fuego como Dragon"); 
    }
    
}
