package grafica;

public class Punto3D extends Punto2D{
    
    private int z;

    // Los constructores
    public Punto3D(){
        super();
        this.z = 0; 
        
    }
    
    public Punto3D(int x, int y, int z){
        super(x, y);
        this.setZ(z); 
    }
    
    public Punto3D(Punto2D otherPoint2D, int z){
        super(otherPoint2D);
        this.setZ(z);
    }
    
    public Punto3D(Punto3D otherPoint){
        this(otherPoint.getX(), otherPoint.getY(), otherPoint.getZ());
    }
    //getters y setters
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        if(z >=0){
            this.z = z;
        }
    }
    @Override
    public String toString(){
        //super dice que vaya a la clase padre Punto2D
        return super.toString() + " - " + "[z: "+ this.z + "]";
    }
    
    @Override
    public double getDistance(Punto otherPoint){
        double resultado = 0.0;
        
        if(otherPoint instanceof Punto3D){
            //hacer el calculo
        }
        return resultado;
    }
}
