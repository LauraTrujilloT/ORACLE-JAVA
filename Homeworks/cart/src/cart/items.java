package cart;

import java.util.Random;

/**
 *
 * @author ltt
 */
public class items {
    private int id;
    private String descr;
    private int quantity;
    private double price;
    private char colorCode;
    private boolean isBackOrdered;
    private static int nextId = 1;
    
    //Constructor
    public items(String desc, double price){
        setId();
        this.descr = desc;
        this.price = price;
        checkStock();
    }
    //Methods
    
    private void checkStock(){
        double num = new Random().nextInt(20);
        if((int) num % 2 == 1){
            this.isBackOrdered = true;
            //System.out.println(getDesc()+" is back ordered");
        }else this.isBackOrdered();
    }
    
    private void setId(){
        id = items.nextId++;
    }
    
    public int getId(){
        return id;
    }
    
    public String getDesc(){
        return descr;
    }
    
    public void setDesc(String desc){
        this.descr = desc;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public boolean isBackOrdered(){
        return isBackOrdered;
    }
    
    public void displayItem(){
        System.out.println("Item: " + descr + ", " + quantity + ", "
        + price + ", " + colorCode);
    }
    
    public void setItemFields(String desc, int qty, double pr){
        this.descr = desc;
        this.quantity = qty;
        this.price = pr;
    }
    
    public int setItemFields(String desc, int qty, double pr,char c){
        if (c != ' '){
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        }else return -1;
    }
    
    public boolean setColor(char colorCode){
        if(colorCode == ' '){
            return false;
        }
        else {
            this.colorCode = colorCode;
            return true;
        }
    }
}
