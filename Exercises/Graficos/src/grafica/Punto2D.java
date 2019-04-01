
package grafica;

public class Punto2D extends Punto {

    private String colorPunto;
    private int x, y; 
    
    //Crear Constructores
    public Punto2D(){
        x = y = 0;
    }
    
    public Punto2D(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    
    public Punto2D(Punto2D newPunto){
        //Forma maluca
        //this.setX(newPunto.getX()); //no puedo acceder por x privado
        //this.setY(newPunto.getY());
        
        //Forma elegante
        this(newPunto.getX(), newPunto.getY());
        //this ahora llama al constructor Punto2D.
    }
    // Hacer get y set
    public void setX(int x){
        //Se utiliza this para referirse a la variable de instancia privada
        if(x >= 0){
            this.x = x;
        }
    }
    
    public int getX(){
        return this.x; 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y >= 0){
            this.y = y;
        }
    }
    
    @Override
    public String toString(){
     //imprime datos de la clase
     //Estoy sobre-escribiendo en la clase object donde esta toString()
        return "[X: " + this.x + "]" + "-" + "[Y: " + this.y + "]";
    }
    
    @Override
    public void setColor(String newColor) {
        this.colorPunto = newColor; 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDistance(Punto otherPoint) {
        
        double resultado = 0.0;
        
        if(otherPoint instanceof Punto2D){
            int distX = (this.x - (((Punto2D) otherPoint).getX()))*(this.x - (((Punto2D) otherPoint).getX()));
            int distY = (this.y - (((Punto2D) otherPoint).getY()))*(this.y - (((Punto2D) otherPoint).getY()));
            
            resultado = Math.sqrt(distX + distY);
        }
        
        return resultado;
    }
    //Sobre-escritura
}
