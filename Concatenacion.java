public class Concatenacion{
  public static void main(String[] args) {
    String cad1 = "Llorando en el lodo del mercado de Paris";
    String cad2 = "En un lugar de la mancha cuyo nombre no me...";

    String cad3 =  " " + cad2;
    cad3.concat(cad1);
    // concantena diferente al +. Evitar usarlo.
    //En lugar de String se debe usar StringBuilder
    System.out.println(cad3);
  }
}
