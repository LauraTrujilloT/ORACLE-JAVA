package ejecucion;

import car.Item;

public class Main {
    public static void main(String[] args) {
        Item bufanda = new Item();
        //Si no pongo new, no crea Item y tendría valor null
        bufanda.descr = "Bufanda de color rojo";
        bufanda.id = 1;
        bufanda.price = 23000.90;
        bufanda.quantity = 1;

        Item camisa = new Item();

        camisa.descr = "Camisa corta de color azul";
        camisa.id = 2;
        camisa.price = 87000.00;
        camisa.quantity = 1;

        System.out.println("Bufanda");
        System.out.format("Bufanda ID: %d \n", bufanda.id);
        System.out.format("Bufanda descr: %s \n", bufanda.descr);
        System.out.format("Bufanda price: %f \n", bufanda.price);
        System.out.format("Bufanda quantity: %d \n", bufanda.quantity);
        // %d imprime enteros

        //carrito.adicionarItem(camisa);
        carrito.listaCompras[0] = bufanda;
        carrito.listaCompras[1] = camisa;
        //Si quiero cambiar
        carrito.listaCompras[0].price = 50000.0;

        for (Item it: carrito.listaCompras) {
          it.display();
        }
    }
}
