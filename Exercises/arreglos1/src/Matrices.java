
public class Matrices {
    public static void main(String[] args) {
        int [][] datos = new int[3][3];
        
        int [][] datos2 = {{1,2},{4,5,6,2,3},{7,8,9}};
        
        for(int f=0; f < datos2.length; f++ ){
            for(int c = 0; c < datos2[f].length; c++){
                System.out.println("["+f+"] ["+c+"]"+datos2[f][c]);
            }
            System.out.println("------------------------");
        }
    }
}
