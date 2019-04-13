# Clase 5: Funciones Lambda
Hace parte de la programación funcional. `Lambda` funciona mediante interfaces funcionales las cuales sólo tienen un **método abstracto**.

```java
mylist.replaceAll(s -> s.toUpperCase());
//Lambda expression s -> s.toUpperCase()
System.out.println("List.replaceAll lambda: "+ mylist);
```
**output**: `List.replaceAll lambda: [THINGS IN MY LIST]`

Las funciones `Lambda`usan: **variables** (inferidas) -> **sentencias**. Por variable inferida, se entiende que no es necesario declarar
el tipo de variable, es decir `String s -> s.toUpperCase()`. Permite el flujo de datos (_Stream_).

## Expresiones `Lambda`
Se tiene parametros de entrada, como cuerpo un método,y un valor que se retorna. Existen tres APIS fundamentales para usar 
las expresiones lambda como: `java.util.functions`, `java.util.stream`, `java.util` (_Enhanced_ : interfaces y clases que forman
colecciones, incluye `List`y `ArrayList`)

```java
public class test {
    public static final double MAX_PRECIO = 100000.0;
    public static final double IVA = 1.19;
    
    public static void main(String[] args) {
        Item apple = new Item("an apple", 95000);
        Item shirt = new Item("black shirt", 85000);
        Item soap = new Item("awesome soap", 25000);
        Item[] arrayShop = {apple, shirt,soap};
        double sumaPrecio;
        ArrayList<Item> shopList = new ArrayList();
        
        //Items to buy:
        for (Item i : arrayShop ) {
            shopList.add(i);
        }
        
        sumaPrecio = shopList.stream().mapToDouble(i -> i.getPrecio() * IVA)
                .filter(l -> MAX_PRECIO > l).sum();
        
        System.out.println("PRECIO TOTAL: " + sumaPrecio);
```

# Errores y Excepciones

Los errores son _irrecuperables_, las excepciones no.

## Qué son las excepciones?
- Algo que no se espera pasa en el programa.
- Java no sabe que hacer:
  - Crea una objeto excepción que contiene información útil al respecto.
  - Lanza una excepción invocando el método que presenta el problema.
  
```java
  public class Excepciones {

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        
        System.out.println(a[3]);
    }
    
}
```
  
  **Output** ` Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at excepciones.Excepciones.main `
  
  ### Tipos de Excepciones
  
  1. `ArithmeticException`
  2. `ArrayIndexOutOfBoundsException`
  3. `ClassCastException`
  4. `NullPointerException` (Para evitar esto, usar `optional`)
  5. `OutOfMemoryError`
  > Para mas información ver [API Exceptions](https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/Exception.html)
  
  Se puede crear `Exception` con `public class Exceptions`.
  
  ### Tipos de Clases `Throwable`
  Excepciones de subclases de `Throwable`. Hay varios tipos:
  
  1. `Error` (no se evaluan)
    - Tipicamente son irrecuperables errores exteriores.
    - _Unchecked_
  2. `RuntimeException` (no se evaluan)
    - Son causados por un error perse de programación
    - _Unchecked_
  3. `Exception`
    - Error recuperable.
    - _Checked_ (Debe ser atrapado _caught_ o lanzado _thrown_)
  
  Estan los siguientes formas de implementar excepciones: `try` (lo que puede generar las excepciones), `catch` (capturan la excepcion), `throws`(propaga la excepción), `throw`(lanza la excepción _queja_), `finally`(bloque que siempre se ejecuta, se utiliza para cerrar flujos de datos).
  
  ## Propagación de Excepciones
  
  **Ejemplo** Jugador lanza pelota, papá se hace responsable:
  
  ```java
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
```
   
  y,
  
  ```java
  import excepciones.RoturaVidrioException;

public class Papa {
    //METODOS
    public void atenderRoturaVidrio(){
        Jugador santiago = new Jugador();
        
        try{
        santiago.lanzarPelote(false);
        }catch (RoturaVidrioException e){
            System.out.println(e);
            System.out.println("Yo pago el vidrio");
        }finally{
            System.out.println("Soy un papá responsable");
        }//El finally es para cerrar los problemas del try/catch
        //aka siempre se ejecuta. Siempre se cierran los flujos de datos.
    }
}
```
  > Todas las clases que se crean de excepciones, heredan de `Exception`.
  
  ### Cómo son lanzadas las excepciones?
  - A través de métodos
  - Si no se atrapan, se propagan.
  
  ### Atrapando y propagando
  - `throw`lanza la excepción pero es necesario que:  
   	- la propague con `throws` ó que
	- la atrape con `try / catch`
 
 ## `IOException`
 Tiene que ver con input and output de datos. Se usa en flujo de datos en general.
  **Ejemplo**:
  
  ```java
	try{
		createFile();
	} catch (IOException ioe){
		System.out.println(ioe);
	} 
  }
  ```
  
  
  
  
  
  
