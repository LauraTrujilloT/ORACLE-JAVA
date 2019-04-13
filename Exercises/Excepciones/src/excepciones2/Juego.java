
package excepciones2;

import excepciones.RoturaVidrioException;


public class Juego {
    public static void main(String[] args) {
        Papa pedro = new Papa();
        
        try {
            pedro.atenderRoturaVidrio();
        } catch (RoturaVidrioException ex) {
            System.out.println("Yo respondo");
        }
    }
}
