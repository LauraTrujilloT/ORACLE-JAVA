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
  
  Estan los siguientes formas de implementar excepciones: `try`, `catch`, `throws`, `throw`.
  
  ## Propagación de Excepciones
  
  
  
  
