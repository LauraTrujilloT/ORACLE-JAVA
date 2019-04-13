
package compras;

import java.util.ArrayList;


public class test {
    public static final double MAX_PRECIO = 100000.0;
    public static final double IVA = 1.19;
    
    public static void main(String[] args) {
        Item apple = new Item("an apple", 95000);
        Item shirt = new Item("black shirt", 85000);
        Item soap = new Item("awesome soap", 25000);
        Item[] arrayShop = {apple, shirt,soap};
        double sumaPrecio;
        ArrayList<Item> shopList = new ArrayList();
        
        //Items to buy:
        for (Item i : arrayShop ) {
            shopList.add(i);
        }
        
        sumaPrecio = shopList.stream().mapToDouble(i -> i.getPrecio() * IVA)
                .filter(l -> MAX_PRECIO > l).sum();
        
        System.out.println("PRECIO TOTAL: " + sumaPrecio);
        /*
        for (int i = 0; i < shopList.size() ; i++){
            double itemPrec = shopList.get(i).getPrecio();
            double precioIva = itemPrec * IVA;
            System.out.println("ITEM " + precioIva);
            if(MAX_PRECIO > precioIva){
                sumaPrecio += precioIva;
            }
            }
        
        
        System.out.println("PRECIO TOTAL: "+sumaPrecio);
        */
    }    
    }

