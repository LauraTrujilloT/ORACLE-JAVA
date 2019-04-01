
package prueba;
import grafica.Punto2D;
import grafica.Punto;
import grafica.Punto3D;
//import grafica.*

public class Test {
    public static void main(String[] args) {
        Punto2D p1 = new Punto2D();
        Punto2D p2 = new Punto2D(2, 3);
        Punto2D p3 = new Punto2D(p2); // Diferente espacio en memoria

        System.out.println("p1: "+ p1);
        System.out.println("p2: "+ p2);
        System.out.println("p3: "+ p3);

        Punto p4 = new Punto2D(5, 5); //Para distance se necesita Punto

        System.out.println(p1.getDistance(p4));

        Punto3D p5 = new Punto3D();
        Punto3D p6 = new Punto3D(1, 2, 3);
        Punto3D p7 = new Punto3D(p2, 7);
        Punto3D p8 = new Punto3D(p6);

        System.out.println("p5: "+ p5);
        System.out.println("p6: "+ p6);
        System.out.println("p7: "+ p7);
        System.out.println("p8: "+ p8);

        Punto p9 = new Punto3D();

        System.out.println(p5.getDistance(p9));
    }
}
