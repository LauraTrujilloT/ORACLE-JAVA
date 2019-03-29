public class Tarea2{
  public static void main(String[] args) {
    String Customer = "Laura Trujillo Taborda";
    String firstName;
    firstName = Customer.substring(0, Customer.indexOf(" "));
    System.out.printf(firstName);

    //StringBuilder nombre = new StringBuilder("Laura");
    //System.out.println("\n",nombre.toString());
  }
}
