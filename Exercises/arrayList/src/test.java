
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> k = new ArrayList();
        ArrayList<String> l = new ArrayList();
       
        k.add("Hola");
        k.add("4");
        k.add("6.3"); //boxing a integer
        l.add("hola");
        l.add("mundo");
        
        System.out.println(k);
        System.out.println(k.contains("4"));
        System.out.println(k.size());
        
        k.remove(0);
        System.out.println(k);
        
        k.addAll(l);
        System.out.println(k); //principio liscop
        
        
        for(Object o: k){
            System.out.println(o);
        }
        
    }
}
