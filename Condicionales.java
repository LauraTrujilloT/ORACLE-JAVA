public class Condicionales{
  public static void main(String[] args) {
    boolean outOfStock = false;
    int quantity = 3;
    String message = "Zapato";

    if (quantity > 1) {
      message = message + "s";
    }
    if (outOfStock) {
      System.out.println("Artículo No Disponible");
    }else{
      System.out.println(quantity + " " + message + " precio:" + 345252);
    }
  }
}
