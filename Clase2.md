# Clase 2
Programación orientada  a Objetivos

## Objetos y clases
Un _Objeto_ se define como un concepto que tiene un conjunto de características (**atributos**) y unas acciones (**métodos**). Son físicos o conceptuales (propiedades: tamaño, nombre, etc. Comportamientos: comprar, poner en carro, pagar.)

Una _Clase_ es un molde o receta (_blueprint_) que permite crear objetos (**instanciación**). Se diferencia los objetos a través de sus atributos. La Clase describe las propiedades y comportamientos de un objeto; permite crear instancias en objetos.

## Atributos y métodos



```java
public class Customer {
  public String name = "Junior Duke";
  public int custID = 1205;
  //Estas variables se llaman VARIABLES DE INSTANCIA
  // Fields (propiedades, atributos)

  public void displayCustomer(){
    //si se define variablles aqui se llama
    //VARIABLE LOCAL
    System.out.println("Customer: "+name);
  }
  // Metodos (comportamientos)
}
```
Ejercicio 6.1 : Crear un item Class. (**archivo** = ejercicio1.java netbeans ó `Item.java`, `Main.java`  )

_item_ : ID (`int`), desc (`String`), quantity (`int`), price(`double`)

**NOTA:** Cuando tengo una _class_ en otro paquete y necesito usarla en otra _class_ hay que **importarla**.
`import NamePackage.NameClass`

La palabra reservada `new` crea nuevos objetos.

## Instancias

La sintaxis es `<class name> variable = new <class name>()`

```java
public static void main(String[] args) {
  Customer customer01 = new Customer();
  //declarar e instanciar
  Customer customer02; //Declarado
}
private int suma(int a, int b){
  return (a+b) //Ejemplo metodos
}
```
**El operador punto** permite acceder a los atributos y métodos de la clase.

## Referencias
En `C#`, los apuntadores hacen referencia a un bloque de memoria donde se guarda información. En `java`, aparece el concepto de referencia que apunta a un bloque de memoria.
Una referencia es `new` en el cual crea un objeto con todos los atributos y métodos de la _class_.

Hay varios tipos de memoria: _de pila_ (almacena datos primitivos y referencias )y _de montón_ (datos de objetos, estructuras dinámicas, etc).

## (more) Arrays
- La variable Array es un objeto referencia, no primitivo del tipo data.
- Debe estar instanciado `int[] ages = new int[4];`


## Manipulación y Formateo de Datos
- Describir `String` _class_ y el uso de métodos.
- Hacer documentación en JDK
- Describir `StringBuilder` _class_
- _Promoting_ y _casting_ de variables.

### `String` _class_
- Un objeto de tipo `String` es _inmutable_, su valor no se puede modificar
- Un objeto `String` puede ser usado como una concatenación de strings mediante el operador `+`.

###### Métodos de `String` _class_
- Primitive type `int`
- `trim()`
- `toLowerCase()`
- `toUpperCase()`
- `split()`
- `substring`
```java
String greet = "HOW".trim();
//Output: O
String lc = greet + "DY".toLowerCase();
// Output: ody
```

### Java API docs
Compendio de `html` donde se puede mirar que tiene una clase por dentro (atributos y métodos).
> Ver documentación de `String` [aquí](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

¿Cómo hacer documentación propia?

### `StringBuilder` _class_
- Solución alternativa a `String`.
- Es **mutable**
- Se instancia con `new`
- Permite poner capacidad inicial.
- Métodos que no tiene `String`

### Tipos de datos primitivos
- Tipo integral (`byte`, `short`, `int`, `long`)
- Tipo float (`float`, `double`)
- Tipo textual (`char`)
- Tipo lógico (`boolean`)

| Básicos | Wrappers |
| ----------- | ----------- |
| `byte` | Byte |
| `short` | Short |
| `int` | Integer |
| ----------- | ----------- |
| `float` | Float |
| `double` | Double |

- **Boxing** de _básicos_ a _wrappers_
- **Unboxing** de _wrappers_ a _básicos_
- **Promoting** de enteros a reales (a cosas que necesitan mas memoria)
- **Casting** lo contrario de _promoting_ . Puede eliminar datos.

### Tipo de texto primitivo
- Sólo `char`
- Example: `public char colorCode = 'U'`


**Unicode**: almacena todos los caracteres posibles

##### Constantes
- Variable (puede cambiar)
- Constante (no puede cambiar) `final int Name = Value;`

##### Operador Modulo División `%`
- Residuo de la División

##### Operadores unarios
- `+=`
- `-=`
- `*=`
- `%=`

##### Operadores incremento y postdecremento
- _Pre incremento_ `++a`: aumenta la variable y después la utiliza
- _Post incremento_ `a++`: Utiliza la variable y después la utiliza
- _Pre_ y _post_ decremento es similar.


### _Promoción_ y _Casting_ de Variables
##### Tipo *Promoting*
 Promociones automáticas:
 - Asignar un tipo pequeño hacia un tipo grande (`byte` to `short` to `int` to `long`)
 - Asignar tipo integral a tipo float.

 Ejemplo: `long intTolong = 6;`

 > **Precauciones** Desplaza bytes de tal forma que si el valor es muy grande, el `output` es negativo.

##### Tipo *Casting*
- Asignar un tipo grande a un tipo pequeño.
- Asignar un tipo float a un tipo integral.

Ejemplo: `int longToInt = (int)20L`; `short doubleToShort = (short)3.0;`

> **Precauciones** Puede cortar datos si no cabe dentro del nuevo tipo. No aproxima decimales.

### Creación y uso de métodos

##### Uso de métodos y constructores
- `void` no almacena, solo indica que el método no retorna un valor.
- `()` indica los argumentos para el método.
```java
public void display (){
  System.out.println("Shirt description:"+ description);
  // end of display method
}
```

##### Método constructor
- Método especial para la instanciar las _class_
- Es creado por `new`
- Su propósito es instancia un objeto y guarda la referencia en la variable ref.
- Asigna memoria, variables y todo el objeto.
- Sintaxis `<modifier> ClassName()`

Otras características Constructor:
1. Tienen el mismo nombre de la _class_
2. No retorna ningún tipo de dato.
3. Se ejecutan cuando se instancia la clase.
4. No se heredan

##### Argumentos de métodos y valores de retorno
