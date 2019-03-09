public class Arreglo{
  public static void main(String[] args) {
    //String[] names = {"Pedro", "Maria", "Juan", "Carlos"};
    String[] names = new String[4];
    names[0] = "Pedro";
    names[1] = "Maria";
    names[2] = "Juan";
    names[3] = "Carlos";

    //System.out.printf("Hay %d clientes \n", names.length);
    // %d concatenamos
    //System.out.printf("En la posicion 1 esta %s", names[1]);

    for (String name: names) {
      System.out.printf("Cliente: %s \n", name);
    }
  }
}
