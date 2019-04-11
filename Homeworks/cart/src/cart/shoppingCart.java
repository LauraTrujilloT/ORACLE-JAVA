package cart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author ltt
 */
public class shoppingCart {
    //ITEMS
    public items[] shopList = {new items("Shirt",10.0), new items("Pants", 30.0),
                            new items("Shoes", 50), new items("Trousers", 20.0)};
    //ArrayList<items> shopList = new ArrayList();
    public double total = 0;

    public static void main(String[] args) {
        
     //Customers
     Customer cust1 = new Customer("Bob Miller", "555-44-33");
     
     //TEST CODE
     shoppingCart cart = new shoppingCart();
     cart.displayTotal();
     cart.fillCart(new items("Pullover", 60.5));
     cart.removeItem("Pullover");
     

     // END TEST CODE
     /*
     // EXERCISES
     //Exercise 7.1     
     cust1.firstName();
     
     //Exercise 7.2
     
     StringBuilder sb;
     sb = new StringBuilder(firstName);
    System.out.println("Nombre: " + sb + "\n Nombre Completo: \n"+
               sb.append(" Miller"));
      
     //Exercise 7.3
      int int1;
      long long1 = 99_000_000_000L;
      float flt1 = 13.5F;
      char ch1 = 'U';
      
      int1 = (int) long1;
      System.out.println("int1: " + int1+"\n long1: "+long1);
      
      //Exercise 8.1 
      
        if (item1.setColor('B')){
            System.out.println("Item1.color: "+item1.colorCode);
        } else System.out.println("Invalid Color");
     
      
      //Exercise 8.2
      items1.setItemFields("Belt", 1, 29.5);
      item1.displayItem();
     
      int retcode = item1.setItemFields("Shirt",1, 34.9, 'B');
      if (retcode < 0){
          System.out.println("Invalid Color Code. Item Not Added");
      } else {
          item1.displayItem();
      }
      
     
     //Exercise 10.2
      
      Order order = new Order("Pablo Dybala", 910.00, "VA", 'C');
       System.out.println("Discount is: "+ order.getDiscount());
       
    //Exercise 11.1
    
    LocalDateTime orderDate;
    orderDate = LocalDateTime.now();
        System.out.println("Order Date: "+orderDate);
    String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);
     
        
    //Exercise 11.3
    shoppingCart cart = new shoppingCart();
    cart.displayTotal();
    */  
    //Exercise 11.4
    ArrayList<String> items2 =  new ArrayList<>();
    items2.add("Shirt");
    items2.add("Pants");
    items2.add(2, "Pants");
    
        //System.out.println("Items2: "+items2);
     
    //Removing an element
    if (items2.contains("Shirt")){
        items2.remove("Shirt");
    }
        //System.out.println("\n items2: "+items2);
     
    }
    
    public void displayTotal(){
        //double total = 0;
        for (items shopList1 : shopList) {
            if (shopList1.isBackOrdered()) {
                continue;
            }
            total += shopList1.getPrice();
        }
        System.out.println("Shopping cart total: "+total);
    }
    
    public ArrayList fillCart(items newItem){
        ArrayList<items> arrayShop = new ArrayList<>(Arrays.asList(shopList));
        arrayShop.add(newItem);
        //for (int i = 0; i < arrayShop.size(); i++){
        //    System.out.println("ArrayShop: "+ arrayShop.get(i).getDesc());
        //}
        return arrayShop;
    }
    
    public void removeItem(String desc){
        ArrayList<items> arrayShop = new ArrayList<>(Arrays.asList(shopList));
        for (int i = 0; i < arrayShop.size(); i++){
            if (desc == arrayShop.get(i).getDesc()){
                arrayShop.remove(i);
            }
          //System.out.println("Cart After removing: "+ arrayShop.get(i).getDesc());
        }
        
    }
}
