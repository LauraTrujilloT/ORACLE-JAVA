package car;
/**
 * <p>Almacena los Items que compra el cliente<\p>
 * @author lvtrujillot
 */
public class ShoppingCart {
    //Métodos
    public void addItem(Item nuevoItem){
        //lógica para adicionar el Item
        Item.add(nuevoItem);

    }
    public void pagarItem(){

        return 0.0;
    }
    public void eliminarItem(Item item){
      Item.remove(item)

    }
    public void cantidadItemShoppingCart(){
      System.out.println(Item.size());
    }
    public void limpiarShoppingCart(){
        return 0;
    }
    //Atributos
    public Item[] listaCompras = new Item[4];
    //Arreglo de 4 de forma estática.
    public double total;


}
