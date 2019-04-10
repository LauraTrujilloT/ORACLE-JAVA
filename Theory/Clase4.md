# Arreglos, Loops y Dates
##### Capítulo 11

### Arreglos
Es un objeto, es decir, se accede mediante una referencia. Un arreglo de arreglos es una matriz, no necesariamente es simétrica o cuadrada. Por lo general, se trabaja con matrices cuadradas de dimensión `n x n`.

## Fechas (Dates)
```java
LocalDate myDate = LocalDate.now();
System.out.println("Today's date: "+ myDate);
```
- `LocalDate` pertenece al paquete `java.time`
- El método `now` retorn la fecha actual.
- `Locate` internacionalización de aplicaciones. Vienen predefinidos.

Sobre `java.time`
- El paquete principal para clases de fechas y hora `java.time.format`


Ejemplo,

```java
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
public class TestFecha {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        JapaneseDate fechaJapon = JapaneseDate.from(hoy);
        System.out.println(hoy);
        System.out.println(fechaJapon);
    }
}
```

> La versión de Java 8 permite trabajar de manera más fácil "sumar" o "restar" con días, es decir, cálculos de fechas. (En JS la librería `momet`)

```java
System.out.println(hoy.plusMonths(5));
System.out.println(hoy.minusDays(30));
```
> La hora 0 en programación 1970-01-01 a las 0:00:01

#### Métodos de `LocalDate`
**instance**
- `myDate.minusMonths();`
- `myDate.plusDays();`

**Static**
- `of(int year, Month month, int dayOfMoth)`
- `parse(Charsequence text, DateTimeFormatter formatter)`
- `now()`

Ejemplo **_formato_** de fechas:

```java
String formatoIso = hoy.format(DateTimeFormatter.ISO_DATE_TIME);
String formatoIso2 = hoy.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
String formatoIso3 = hoy.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
```
#### Args

Para ejecutar desde la consola y dar parametros (`Ejercicio.java`) se hace lo siguiente:

```
> javac Ejercicio.java

> java Ejercicio param1 param2 param3 4 879.0
param1
param2
param3
4
879.0
```

## Arreglos Bidimensionales
Se utilizan para representar variables interrelacionadas.

Sintaxis `type [][] NameMatrix;` (Fila Columna) de 2D para 3D se añade corchetes []

```java
public class Matrices {
    public static void main(String[] args) {
        int [][] datos = new int[3][3];

        int [][] datos2 = {{1,2,3},{4,5,6},{7,8,9}};

        for(int f=0; f < datos2.length; f++ ){
          for(int c = 0; c < datos2[f].length; c++){
            System.out.println("["+f+"] ["+c+"]"+datos2[f][c]);
          }
        System.out.println("------------------------");
        }
    }
}
```

## Ciclos (Loops)
Son usados para repetir bloques de código mientras la condición sea verdadera `while`,`for`, `do/while`
Tienen 3 partes: variable de control, condición salida, incremento/decremento variable de control

**Sintaxis**

- `while(boolean_expression){code_block};` Se utiliza cuando no sabe cuantas veces iterar.

- `for(<type> counter = n); <boolean_expression>{ code_block};` Se utiliza cuando se sabe cuando se debe terminar el ciclo (rangos conocidos)

- `enhanced for`

- `do{code_block} while(boolean_expression);` Permite al menos la ejecución del código al menos una vez.

### `continue` y `break`
Hay dos formas de interrumpir iteraciones en un ciclo:
- `break` sale del ciclo.
- `continue` permite retornar al ciclo sin terminar la iteración.

## Ciclos Anidados



## Clase `ArrayList`
Es una estructura dinámica permite aumentar o disminuir el tamaño del arreglo `array`. Se comporta como si fuera una lista `List`
- Stack ---> Pila
- Queue ---> Cola

**Métodos**
- `add`
- `get`
- `remove`
- `indexOf`

Todas las estructuras de Java almacenan objetos, no se puede tener un `ArrayList` de tipo `int` o `char` por ejemplo, sino de wrappers `Integer` o `Character`. Ejemplo `age.add(new Integer 5);`

Los genéricos son los que están entre `< >`.
- Para designar el tipo de un objeto: `ArrayList<String> states = new ArrayList();`
- Para llamar métodos e un `ArrayList` o sus elementos: `states.get(48).length(); ` por ejemplo, tamaño del elemento 49.

**Cómo utilizar `ArrayList`?**
- Se debe _importar_ `java.util.ArrayList`
- `ArrayList` puede contener cualquier tipo de objeto, incluyendo un tipo que uno haya creado en alguna clase.


Ejemplo:

```java
import java.util.ArrayList;
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
```


# Interfaces
#### Capítulo 10

Definir comportamientos (contratos). Capacidad de hacer algo. Me permiten adicionar nuevas caracteristicas sin romper la regla de (cerrado) para modificar y (abierto) para extender.

No se soporta variables en una interfaz sino **constantes** (cualquier atributo es constante), todo es de acceso público y los métodos son siempre **abstractos**

Para implementar una interfaz se usa el comando `implements`, además los nombres de las interfaces son sustantivos.

Las interfaces pueden heredar de otras interfaces (las que sean).
**¿Cómo implementarlo en Java?**

```java
package interface1;

public interface LanzarFuego {
    // CONSTANTES deben tener UN VALOR
    //No se soportan variables en interfaces
    public void lanzarBolaDeFuego();
    // Es un método abstracto
    // public es innecesario
}
```
Para la clase:

```java
package classes;

import interface1.Atacar;
import interface1.Correr;
import interface1.Decapitar;

public class Ninja extends Personaje implements Correr, Atacar, Decapitar {

    @Override
    public void correr() {
        System.out.println("Correr como un Ninja");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lanzarShuriken() {
        System.out.println("Lanzar Shuriken como Ninja"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mocharCabeza() {
        System.out.println("Mochar cabeza como Ninja"); //To change body of generated methods, choose Tools | Templates.
    }

}
```
> Ver carpeta Interfaces en [Github](https://github.com/LauraTrujilloT/ORACLE-JAVA/tree/master/Exercises/Interfaces)

## Herencia multiple
Java no soporta la herencia múltiple.

**¿Cómo se soluciona?** A través del concepto de las interfaces.

### Casting de Interfaces
-

### Interfaz `List`
#### Colección de frameworks
Esta en el paquete `java.util`.



Ejemplo _List_:
```java
public class lists {
    public static void main(String[] args) {
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums);
        
        ArrayList<String> myArrayList = new ArrayList(myList);
        
        System.out.println(myList);
        
        String[] nums2 = {"four", "five", "six"};
        ArrayList<String> myArrayList2 = new ArrayList(Arrays.asList(nums2));
        
        System.out.println(myArrayList2);
}
}
```
