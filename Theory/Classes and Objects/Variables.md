# Variables
State information, are sort of containers which contains _Raw data_ and _object references_ e.g. `Student s = new Student();`.

## Introduction
Variables can hold different **types** of data such as _numeric_, _strings_, _references_. Also, types define the kind of operations that can be implemented. The type of the variable is defined right after it's created and this variables cannot be changed for another _type_ , due to this **java** is referred as **statically typed language** and in those languages we have **static type checking**.

### Variable Declaration
- Syntax `<type>  <name> [= literal or expression];`
- Literal -> _raw data_
  - `int count = 25;`
  - `boolean flag = true;`
- Expression -> evaluated to single value
  - `int count = x;`
  - `int count = getCount();`

### Reinitializing Variable
- Variable ~ something whose value can be changed.
- Assignment statement
  - Syntax `<variable-name> = literal or expression`
  - `count = 23;`
  - `count = x + y; `

**Advantages of Static Typing**
- Helps in earlier detection of programming mistakes as it allows variable types to be checked at compile time itself.
- It is also helpful during method overloading. We can have multiple versions of the same method in the same class.
- Permits better developer experience in IDEs.
- Maintainability is another advantage.
> For [more information](http://stackoverflow.com/questions/125367/dynamic-type-languages-versus-static-type-languages)

## Variable Kinds
1. Instance Variables
2. Static Variables
3. Local Variables

There are variable types such as primitives and object references (non primitive)
>_Instance_ and _static_ variables are also referred as **fields** or **attributes**.

### 1. Instance Variables
- Declared directly within class
- Represent **object state**
- Gets default value
- Cannot be **reinitilized** directly within class.

### 2. Static Variables
- Declared directly withing class with keyword `static`.
- Class variables (one copy per class).
- Gets default value
- Cannot be **reinitilized** within class.

### 3. Local Variables
- Declared in methods
- includes method parameters.
- Not accessible outside method.
- **Dont** get default values.

## Variables: Primitive Types
