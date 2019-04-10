## Capítulo 8-16 Presentación Oracla java

Ejemplo de métodos:

```java
public static void main(String[] args) {
  Shirt shirt01 = new Shirt();
  Shirt shirt02 = new Shirt();

  shirt01.setFields("Sailor", "B", 30);
  shirt02.setFields("Sweat", "B", 30);
}
```
**Método:**

```java
public class Shirt{
  public String description;
  public char colorCode;
  public double price;

  public void setFields(String desc, char color, double price){
    this.description = desc;
    this.colorCode = color;
    this.price = price;
  }
}
```

### Ventajas de usar métodos

- Programas mas faciles de entender
- Reciclar código
- Rapidez de mantenimiento y desarrollo de Programas

**Tarea** : Ejercicio 8.1 declarar un método  `setColor`(8-23)

## Métodos y Variables Estáticas

El modificador `static` pertenece a **class** y permite compartir esto con todos los objetos de la clase. No es unico para una instancia objeto. No puede accedes sin instanciar.

Una **variable estática** es compartida por todos los objetos de la clase. Se indica con un -*underscore*-.

Una **variable de instancia** es unica para cada objeto.

También existen **métodos estáticos**:
- No se puede utilizar atributos que no sean **estáticos**


### Crear y acceder partes Estáticas

- Para crear variable o método:
   `static String mSmall;`
   `static void setMSmall(String desc);`
- Para acceder a variables o métodos `static`
  - Desde otra clase:
  `ItemSizes.mSmall;`
  `ItemSizes.setMSMall("Mens small");`
  - Desde la clase: `mSmall;`
  `setMSmall("mens small");`

**Ej metodos estaticos**: Math, wrappers

### Métodos estáticos y variables en JAVA API
- Algunas funciones en `Math`: exponencial, logaritmo, etc
- Algunas funciones de la clase `System`: retribuyendo variables, acceso input y output.

**Ejemplo**:
Se crea la clase _Pasajero_ en la carpeta _ejercicio2_
```java
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
```

Se crea la clase _main_ en la carpeta _ejercicio2_
```java
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numero Max sillas: "+ Pasajero.MAX_SILLAS);
        Pasajero.setNumero();
        System.out.println("Numero de pasajeros:" + Pasajero.numero);
        //Para crear silla se necesita instanciar
        Pasajero eliza = new Pasajero();
        eliza.setSilla("A3");
        eliza.setNumero(); // se invoca desde el objeto: No hay problema
        System.out.println("Numero de pasajeros:" + Pasajero.numero);
    }

}
```

## Pasar una Referencia (object reference)
**_Referencia_:** Se modifica el argumento ya que ocupa o apunta al mismo espacio de memoria en Pila.

```java
int a[] = {1, 2, 3, 4}
int imprimir(int[] b){ //ARREGLOS SON OBJETOs
  b[1] = 40;
  System.out.println("")
}
arreglos.imprimir(a) //modifica la posicion 1 de a[] por 40
```

**_Valor_:** Cuando paso argumentos como valor, se hace una copia y los argumentos quedan intactos. Ejemplo:

```java
int a = 10; //variables de instancia
int b = 8;

int suma (int a, int b){
  a = 30; // variables locales
  b = 40;
  return (a+b);
}
```

Aquí se hace una copia de `a, b` y en caso de que en las variables locales no se modifiquen, se toman la copia de estos valores.

### Sobrecarga de Métodos

Se tiene, por ejemplo, un método como:
```java
int suma (int a, int b){
  return (a + b);
}
```
Si se quisiera sumar tres parametros, se hace la sobrecarga de métodos:

```java
int suma(int a, int b, int c){
  return (a + b + c);
}
```
La _firma_ de un método  se define en este caso por el número de parametros o su forma (si es `int, double, etc`). Un método puede tener el mismo nombre pero la firma lo diferencia. En el ejemplo, la firma es que en uno se dan 2 argumentos mientras que en el otro 3.

### Sobrecarga de métodos y Java API

|Método| Uso |
| ----------- | ----------- |
| `void println()` | Termina la linea con separador String |
| `void println(boolean x)` | Imprime valor Boolean y termina linea

**Tarea** : Ejercicio 8-2

## Usando Encapsulamiento

Encapsulamiento es la forma de ocultar como están hechas las cosas al interior de las clases (colocando acceso `private` a lo que no quiero que sea modificado, de otra forma `public`).

Las clases _inmutables_ son las que una vez creada no se puede modificar (reciben valores y evitar que se cambien estos valores)

### Control de acceso

##### ¿Qué son?
Permite ocultar campos o métodos de otras clases. Determina como datos internos son modificados. Mantiene separada la implementación de la interfase pública.

### Encapsulamiento
- Ocultar campos de objetos.
- Mejora el diseño orientado a objetos
- Acceso seguro mediante métodos `get` y `set`.

##### Métodos Get y Set
`set` dar atributo a un valor. `get`

```java
public Pasajero{
  private boolean reserva;


  public boolean isReserva(){
    return reserva;
  }
}
```
**Tarea:** Ejercicio 9-1

### Sobrecarga de constructores
Ejemplo: Diapositiva 9-18
```java
public class ShirtTest{
  public static void main(String[] args) {
    Shirt theShirt = new Shirt();

    //
    theShirt.setColorcode('R');
    theShirt.setDescription("Algo ");
  }
}
```
> El constructor no retorna nada y se debe llamar igual a la clase.

- Cuando se crea un constructor con argumentos, el constructor por defecto no se crea en el compilador.
- Para crear un constructor dentro de otro constructor se usa `this` (debe estar de primero)
> Ver ejemplo 9-22

**Tarea:** Ejecicio 9-2

## Mas Condicionales

### Operadores condicionales y relacionales

Los _operadores relacionales_ verifican como esta un valor con respecto a otro (`==, !=, <, >, <=, >=`).

Ejemplo:
```java
String a = "Hola";
String b = "Hola";

if (a == b){
  //Esto seria True ya que a y b apuntan al mismo
  //espacio en memoria.
}
```
Se podría hacer con `equals`
```java
public class Employees{
  public String name1 = "Fred Smith";
  public String name2 = "Sam Smith";

  public void areNamesEqual(){
    if (name1.equals(name2)){
      System.out.println("Same name.");
    }
    else {
      System.out.println("Different name.");
    }
  }
}
```

Los _operadores condicionales_ cuando se cumpla el statement es True (`&&, ||, !`) y el _operador terniario_ `<expression> ? <true>: <false>`, ejemplo si `int a =3 int b =2` entonces `a > b ? a = 5 : a = 10`, con ello a tomaría el valor de 5.

### Swtich

> Leer final capitulo 9

# Capítulo 12: Herencias
La _herencia_ es utilizada para evitar re-escritura de código `extends`. (Responde a la pregunta _¿Es un tipo de ...?_ Si la respuesta es afirmativa, Es herencia).

### Trabajando con superclases y subclases

> Leer

### Re-escribiendo métodos superclases
Un _polimorfismo de sobre-escritura_ es cuando se cambia el método o métodos del hijo  al del padre. En otras palabras, si a traves de la herencia sobreescribo un método.

Un _polimorfismo de sobrecarga_ misma acción pero comportamiento diferente (del hijo).

### Mas acerca de accesos de Control
Define si otras clases pueden usar un campo en particular o invocar un método particular. **Top level** `public`, `package-private (no modifier)`. **Member level** `public, private, protected, no modifier`.

- `public`
- `protected`
- `no modifier`
- `private`

### Sobre-escritura de Métodos
**Sobreescritura** una subclase  implementa un metodo (no puede ser privado) que tiene una superclase.

**Modificadores de acceso** Solo se puede sobreescribir si el metodo es accesible desde la subclase. La firma del método no puede tener restricciones de acceso (stronger) que el que está en la superclase.


### Polimorfismo
Significa que el mismo mensaje para dos objetos diferentes pueden tener resultados diferentes.

#### Usar superclase como referencia
Ejemplo
```java
Clothing garment1 = new Shirt();
Clothing garment2 = new Trousers();
```

#### Operador `instanceof`
Me permite saber si la instancia de un objeto es una clase.

### Clases abstractas
Aquellas que tienen métodos abstractos (aquel que tiene un comportamiento y no lo implementa).  Las clases abstractas pueden tener, sin embargo, atributos y métodos en contraste con las interfases. **No** pueden crear instancias.

```java
public abstract void lavar();
```

#### Herencia Clases Abstractas

```java
public abstract class Clothing{
  private int id;

  public int getId(){
    return id;
  }
  protected abstract double getPrice();
  public abstract void display();
}
```
Y,

```java
public class Socks extends Clothing {
  private double price;

  protected double getPrice(){
    return price;
  }
  public void display(){
    System.out.println("ID: "+getId());
    System.out.println("Price: $"+ getPrice());
  }
}
```

#### EJEMPLO JUEGO DE PUNTOS

|Gráfica |
| ----------- |
| **Punto A**|   |
|    _Sin atributos_      :  |    _Abstracta_       |
|+ setColor(String) | + getDistance(Punto) : `double`|
| **Punto 2D**|  ^ |
|- x: `int`| - y: `int`|
|+ Punto2D() | + Punto2D(x, y)|
| + Punto2D(Punto2D)| + toString()|
| **Punto 3D**|   |
| - z: `int` | |
| get/set | + Punto3D|
| + Punto3D(`int`, `int`, `int`)| +Punto3D(Punto3D)|
| + Punto3D(Punto2D, `int`)| toString()|
