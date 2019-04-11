
package cart;

/**
 *
 * @author ltt
 */
public class Customer {
    private String name;
    private String ssn;
    
    //Adding constructor
    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    //Encapsulate this class
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
    
    public void displayCustomer(){
        System.out.println("Customer: "+ name);
    }
    
    public void firstName(){
        int spaceIdx;
        String firstName;
        spaceIdx = this.getName().indexOf(" ");
        firstName = this.getName().substring(0, spaceIdx);
        System.out.println("Customer's first Name: "+ firstName);
    }
}
