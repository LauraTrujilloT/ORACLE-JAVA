package ejercicio2;
public class Pasajero {
   
   static final int MAX_SILLAS;
   String silla; //definicion atributo
   static int numero = 0; 
   
   public void setSilla(String puesto){
       silla = puesto; //Accediendo a atributo de instancia
   }
   
   public static void setNumero(){
       numero++;
   }
   
   static{
       MAX_SILLAS = 50;
   }
}
