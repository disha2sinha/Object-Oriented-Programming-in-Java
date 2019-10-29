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

# METHODS:

A method is a collection of statements that perform certain tasks upon calling and return the result to the caller. A method can perform certain tasks without even returning anything. Methods allow us to reuse the code without retyping the code.

**Method Declaration:**
Method delaration contains six components:

   1.**Modifier:** Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
   
        public: accessible in all class in your application.
        protected: accessible within the class in which it is defined and in its subclass(es)
        private: accessible only within the class in which it is defined.
        default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
  2.**The return type :** The data type of the value returned by the method or void if does not return a value.
   
  3.**Method Name :** the rules for field names apply to method names as well, but the convention is a little different.
   
  4.**Parameter list :** Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters,empty parentheses () are used.
  
  5.**Exception list :** The exceptions the method can throw can be specified.
  
  6.**Method body :** It is enclosed between braces {} and contains the code to be executed to perform the intended operations.

**Memory allocation for methods calls:**

Methods calls are implemented through stack. Whenever a method is called a stack frame is created within the stack area and after that the arguments passed to and the local variables and value to be returned by this called method are stored in this stack frame and when execution of the called method is finished, the allocated stack frame would be deleted. There is a stack pointer register that tracks the top of the stack which is adjusted accordingly.

**Java is strictly pass by value**:

**FOLDER:Methods:**

**Code1:[PassByValue1.java]:** We pass an int to the function “change()” and as a result the change in the value of that integer is not reflected in the main method.Java creates a copy of the variable being passed in the method and then do the manipulations. Hence the change is not reflected in the main method.

In Java, all non-primitives (or objects of any class) are always references. Java creates a copy of references and pass it to method, but they still point to same memory reference. Mean if set some other object to reference passed inside method, the object from calling method as well its reference will remain unaffected.


**Code2:[PassingObjects1.java]:** A program to show that references are also passed by value. 

If we do not change the reference to refer some other object (or memory location), we can make changes to the members and these changes are reflected back.

**Code3:[PassingObjects2.java]:** A program to show that we can change members of a reference if we do not change the reference itself.

**Code4:[PassingObjects4.java]:** Another Program to illustrate passing object to methods.

Java doesnot support returning multiple values by a method

**Code5:[ReturningValues1.java]:** Returning multiple values using array.

**Code6:[ReturningValues2.java]:** Returning multiple values by returning object.

**CONSTRUCTORS:**

Constructors are used for initializing new objects. Constructors does not return any values but implicitly it returns the object of the class. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.


**CONSTRUCTORS VS METHODS:**

Constructors in Java can be seen as Methods in a Class. But there is a big difference between Constructors and Methods.

1.Constructors have only one purpose, to create an Instance of a Class. This instantiation includes memory allocation and member initialization (Optional).

By contrast, Methods cannot be used to create an Instance of a Class.

2.Constructors cannot have Non Access Modifiers while Methods can.

3.Constructors cannot have a return type(Including void) while Methods require it.

4.The Constructor name must be the same as the Class name while Methods are not restricted.

5.As per Java naming convention, Method names should be camelcase while Constructor names should start with capital letter.

**JAVA ACCESS MODIFIERS:**

|           | **PRIVATE**|**DEFAULT**|**PROTECTED**|**PUBLIC**|
|:---------:|:----------:|:---------:|:-----------:|:--------:|
|**WITHIN SAME CLASS**|YES|YES|YES|YES|
|**FROM ANY CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY NON-SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB-CLASS FROM DIFFERENT PACKAGE**|NO|NO|YES|YES|
|**FROM ANY NON-SUB CLASS FROM DIFFERENT PACKAGE**|NO|NO|NO|YES|



**FOLDER:Class and objects:**

**Code1:CreatingObjects1.java:** Shows the creation of object using 'new' keyword.The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory.

**Code2:Constructor.java :** Shows the creation and invoking of a constructor.The new operator also invokes the class constructor.

**Code3:CreatingObjects2.java:** Shows the creation of object and accessing class members without creating a constructor.

**Code4:GuessingGame.java:** A simple game implemented using classes and objects.

**Code5:OrderOfExecution.java:** Shows the order of execution of static anonymous and init(constructor) block.From the output of this code it can be seen that STATIC block will execute only once when class gets loaded.But Anonymous block and Constructor will run every time object of a Class gets created. Init block will get executed first and then constructor.

**Code6:SwapObjects.java:** code to swap two objects of the same class with only one class member.

**Code7:SwapObjects2problem.java:** Code shows the problem to swap two objects of a class with more than one class members if we use the same way used in Code6.

**Code8:SwapObjects2Solution.java:** Code shows the solution to Code7 problem using Wrapper class.A wrapper class solution works even if the user class doesn’t have access to members of the class whose objects are to be swapped.

**INHERITANCE:**

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

    Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
    
    Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
    
    Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

### Types Of Inheritence:

**1.Single Inheritence:** In single inheritance,one subclass inherit the features of one superclass.

**2.Multilevel Inheritence:**  In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class.

**3.Hierarchical Inheritence:**  In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class.

**4.Multiple Inheritence:** In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes.Java does not support multiple inheritance with classes. In java, we can achieve multiple inheritance only through Interfaces.
Multiple inheritance is not supported by Java using classes , handling the complexity that causes due to multiple inheritance is very complex. It creates problem during various operations like casting, constructor chaining etc 

**FOLDER:Inheritence:** 

**Code1: [ObjectCreation.java]:** Code shows that super class and sub class constructors refer to the same objects.

**Code2: [SingleInheritence.java]:** Code to demostrate how Single Inheritence works.

**Code3: [MultilevelInheritence.java]:** Code to demonstrate how Multilevel Inheritence works.

**Code4: [HierarchicalInheritance.java]:** Code to demonstrate how Hierarchical Inheritance works.

# this KEYWORD:

'this' works as a reference to the current object, whose method or constructor is being invoked. This keyword can be used to refer to any member of the current object from within an instance method or a constructor.

**FOLDER: this keyword:**

**Code1: [this1.java]:** this used to refer current class instance variables.

**Code2: [this2.java]:** used to invoke current class constructor.

**Code3: [this3.java]:** used to invoke current class instances.

**Code4: [this4.java]:** used as method parameter.

**Code5: [this5.java]:** used to invoke current class method.

**Code6: [this6.java]:** used as an argument in constructor call.

# super KEYWORD:

**FOLDER:super KEYWORD:**







