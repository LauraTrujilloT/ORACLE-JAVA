
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numero Max sillas: "+ Pasajero.MAX_SILLAS);
        Pasajero.setNumero();
        System.out.println("Numero de pasajeros:" + Pasajero.numero);
        //Para crear silla se necesita instanciar 
        Pasajero eliza = new Pasajero();
        eliza.setSilla("A3");
        eliza.setNumero(); // se invoca desde el objeto: No hay problema
        System.out.println("Numero de pasajeros:" + Pasajero.numero);
    }
    
}
