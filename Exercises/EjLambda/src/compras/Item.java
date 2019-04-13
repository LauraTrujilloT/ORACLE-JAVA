
package compras;

public class Item {
    private String desc;
    private double precio;
    
    //Constructores
    
    public Item(){
    }
    
    public Item(String desc, double prec){
        this.desc = desc;
        this.precio = prec;
    }


    public String getDesc() {
        return desc;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

   
    public double getPrecio() {
        return precio;
    }

    
    public void setPrecio(double precio) {
        if(0 > precio){
        this.precio = precio;
        } else{
            this.precio = 0;
        }
    }
    
    //Métodos
    @Override
    public String toString(){
        return "Items (" + "Descripción = " + desc + ", precio" + precio +")";
    }
    
    public double CalcIVA(){
        double iva = 0.19;
        return iva * precio;
    }
}
