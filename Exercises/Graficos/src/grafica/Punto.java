
package grafica;

public abstract class Punto { 
//Si hay metodos abstractos tambien debe ser clase abstracta
    public abstract void setColor(String newColor);
    public abstract double getDistance(Punto otherPoint);
}
