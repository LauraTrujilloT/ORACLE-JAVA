
package excepciones2;

import excepciones.RoturaVidrioException;

public class Jugador {
    public void lanzarPelote(boolean rompeVidrio) throws RoturaVidrioException {
         //throw Lanza UNA excepcion quejandose
         // throws lanza la excepcion a otra clase 
        if (rompeVidrio){
            throw new RoturaVidrioException();
        }
    }
}
