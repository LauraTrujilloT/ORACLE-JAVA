# Class & Objects

An Object-Oriented Programming(OOP) is all about objects. Those are creating from a Class. Both are fundamental units of OOP.

Classes have states (_attributes_ or _variables_) and behaviors (_methods_).

**Ex**: Creating Student Class.

```java
class Student{
  //variable declaration
  int id;
  String name;
  String gender;

  //Method definitions
  boolean updateProfile(String newName){
      name = newName;
      return true;
  }
}
```
**Ex**: Executing StudentTest.

```java
class StudentTest{
  public static void main(String[] args) {
    //1. Creating a new student object
    Student s = new Student();

    //2. setting student's state
    s.id = 1000;
    s.name = "joan"; //misspelled
    s.gender = "male";

    //3. updating profile with correct name
    s.updateProfile("john");
  }
}
```

## Java Basics

1. **Naming Rules for Clases, Methods and Variables**
  - _First character_ : letter, underscore, $
  - _Remaining_: letter, underscore, $, numbers
  - No reserved keywords such as: `instanceOf`, `class`, `interface`, `abstract`, `int`, `long`, `synchronized`, and [more](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)
2. **Java is case-sensitive.**
  - `int id = 0` , `int Id = 0` are both valid and different.
3. **Printing to console**
  - `System.out.println("Hello, World!");` Advance cursos to beginning of next line.
  - `System.out.print("Hello, World!");` Cursor stayed after the printed string.
4. **Comments or Disabling Code**
  - `//` for comments of 1 line long or disabled a single line.
  - `/* */` _block codes_  disable large lines of code.
5. **Arithmetic Operations**
  - `+`, `-`, `*`, `/`, `%`
