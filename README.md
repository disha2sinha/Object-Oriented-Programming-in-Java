# Object-Oriented-Programming-in-Java

**JAVA IS A PLATFORM-INDEPENDENT LANGUAGE**

The codes written in Java are converted into an intermediate level language called **bytecode**,after compilation which becomes a part of the java platform,independent of the machine on which the code runs.This makes Java highly portable as its bytecodes can be run on any machine by an interpreter called **Java Virtual Machine(JVM)**

**JAVA IDENTIFIERS**

An identifier can be a method name,class name,variable name or label.

**Code1:: FirstProgramme.java:** 

In this Code,there are 5 identifiers:

**FirstProgramme:** Class Name

**main:** Method name

**String:** predefined class name

**args:** variable name

**a:** variable name

**JAVA RESERVED WORDS**

There are **53** reserved words in Java of which **50** are **keywords** and **3** are **literals**(**true,false,null**)

# OOP CONCEPTS:

**CLASS:**

A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

    Modifiers : A class can be public or has default access.
    
    Class name: The name should begin with a initial letter (capitalized by convention).
    
    Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    
    Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    
    Body: The class body surrounded by braces, { }.

**OBJECT:** 

An object is an instance of a class.Technically, Class is a template which describes what state and behavior of an instance this class can have. Object implements the state and behavior in the form of variables and methods and requires some memory allocated.An object consists of:

    State : It is represented by attributes of an object. It also reflects the properties of an object.
    
    Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
    
    Identity : It gives a unique name to an object and enables one object to interact with other objects.
    
    
**Declaring Objects (Also called instantiating a class):**

When an object of a class is created, the class is said to be **instantiated**. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.


**CONSTRUCTORS:**

Constructors are used for initializing new objects. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.


**CONSTRUCTORS VS METHODS:**

Constructors in Java can be seen as Methods in a Class. But there is a big difference between Constructors and Methods.

1.Constructors have only one purpose, to create an Instance of a Class. This instantiation includes memory allocation and member initialization (Optional).

By contrast, Methods cannot be used to create an Instance of a Class.

2.Constructors cannot have Non Access Modifiers while Methods can.

3.Constructors cannot have a return type(Including void) while Methods require it.

4.The Constructor name must be the same as the Class name while Methods are not restricted.

5.As per Java naming convention, Method names should be camelcase while Constructor names should start with capital letter.



