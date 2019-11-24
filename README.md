# Object-Oriented-Programming-in-Java

References: [Geeksforgeeks](https://www.geeksforgeeks.org/java/) , [javabeginnerstutorial](https://javabeginnerstutorial.com/core-java-tutorial/)


**JAVA IS A PLATFORM-INDEPENDENT LANGUAGE**

The codes written in Java are converted into an intermediate level language called **bytecode**,after compilation which becomes a part of the java platform,independent of the machine on which the code runs.This makes Java highly portable as its bytecodes can be run on any machine by an interpreter called **Java Virtual Machine(JVM)**

**JAVA IDENTIFIERS**

An identifier can be a method name,class name,variable name or label.

**Code1::[FirstProgramme.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/FirstProgramme.java):** 

In this Code,there are 5 identifiers:

**FirstProgramme:** Class Name

**main:** Method name

**String:** predefined class name

**args:** variable name

**a:** variable name

**JAVA RESERVED WORDS**

There are **53** reserved words in Java of which **50** are **keywords** and **3** are **literals**(**true,false,null**)

# CLASS:

A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

    Modifiers : A class can be public or has default access.
    
    Class name: The name should begin with a initial letter (capitalized by convention).
    
    Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    
    Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    
    Body: The class body surrounded by braces, { }.

# OBJECT:

An object is an instance of a class.Technically, Class is a template which describes what state and behavior of an instance this class can have. Object implements the state and behavior in the form of variables and methods and requires some memory allocated.An object consists of:

    State : It is represented by attributes of an object. It also reflects the properties of an object.
    
    Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
    
    Identity : It gives a unique name to an object and enables one object to interact with other objects.
    
    
**Declaring Objects (Also called instantiating a class):**

When an object of a class is created, the class is said to be **instantiated**. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.

**PACKAGE:[Class and objects](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Classes%20and%20objects):**

**Code1:[CreatingObjects1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/Creatingobjects1.java):** Shows the creation of object using 'new' keyword.The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory.

**Code2:[Constructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/Constructor.java) :** Shows the creation and invoking of a constructor.The new operator also invokes the class constructor.

**Code3:[CreatingObjects2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/Creatingobjects2.java):** Shows the creation of object and accessing class members without creating a constructor.

**Code4:[GuessingGame.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/GuessingGame.java):** A simple game implemented using classes and objects.

**Code5:[OrderOfExecution.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/OrderOfExecution.java):** Shows the order of execution of static anonymous and init(constructor) block.From the output of this code it can be seen that STATIC block will execute only once when class gets loaded.But Anonymous block and Constructor will run every time object of a Class gets created. Init block will get executed first and then constructor.

**Code6:[SwapObjects.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/SwapObjects.java):** code to swap two objects of the same class with only one class member.

**Code7:[SwapObjects2problem.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/SwapObjects2Problem.java):** Code shows the problem to swap two objects of a class with more than one class members if we use the same way used in Code6.

**Code8:[SwapObjects2Solution.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/SwapObjects2Solution.java):** Code shows the solution to Code7 problem using Wrapper class.A wrapper class solution works even if the user class doesn’t have access to members of the class whose objects are to be swapped.


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

**PACKAGE:[Methods](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Methods):**

**Code1:[PassByValue1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/PassByValue1.java):** We pass an int to the function “change()” and as a result the change in the value of that integer is not reflected in the main method.Java creates a copy of the variable being passed in the method and then do the manipulations. Hence the change is not reflected in the main method.

In Java, all non-primitives (or objects of any class) are always references. Java creates a copy of references and pass it to method, but they still point to same memory reference. Mean if set some other object to reference passed inside method, the object from calling method as well its reference will remain unaffected.


**Code2:[PassingObjects1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/PassingObjects1.java):** A program to show that references are also passed by value. 

If we do not change the reference to refer some other object (or memory location), we can make changes to the members and these changes are reflected back.

**Code3:[PassingObjects2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/PassingObjects2.java):** A program to show that we can change members of a reference if we do not change the reference itself.

Java doesnot support returning multiple values by a method

**Code4:[ReturningValues1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/ReturningValues1.java):** Returning multiple values using array.

**Code5:[ReturningValues2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/ReturningValues2.java):** Returning multiple values by returning object.

**Code6:[ReturningValues3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/ReturningValues3.java):** Returning multiple values by using List Object class

When we pass a primitive type to a method, it is passed by value. But when we pass an object to a method, the situation changes dramatically, because objects are passed by what is effectively call-by-reference. Java does what’s sort of a hybrid between pass-by-value and pass-by-reference. Basically, a parameter cannot be changed by the function, but the function can ask the parameter to change itself via calling some method within it.

While creating a variable of a class type, we only create a reference to an object. Thus, when we pass this reference to a method, the parameter that receives it will refer to the same object as that referred to by the argument.This effectively means that objects act as if they are passed to methods by use of call-by-reference.Changes to the object inside the method do reflect in the object used as an argument.


**Code8:[PassingObjects3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/PassingObjects3.java):** Another Program to illustrate passing object to methods.

**Code9:[ReturningObjects.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/ReturningObjects.java):** A program to illustrate method returning object.

### METHOD OVERLOADING:

In java,it is possible to define two or more methods within the same class that share the same name as long as their parameter declaration are different either in terms of number of parameters or type of the parameters or both.This process is called Method Overloading.
Priority wise, compiler take these steps when the exact Prototype doesnot match with the arguments:


1.Type Conversion but to higher type(in terms of range) in same family.
2.Type conversion to next higher family(suppose if there is no long data type available for an int data type, then it will search for the float data type).

**Code10:[MethodOverloading1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MethodOverloading1.java):** A program to illustrate how method Overloading works.

We can overload two or more static methods with same name, but differences in input parameters.We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same). 

The compiler does not consider the return type while differentiating the overloaded method. But two methods with the same signature and different return type can not be declared. It will throw a compile time error.

Hence Method overloading can be done by changing:

    1.The number of parameters in two methods.
    2.The data types of the parameters of methods.
    3.The Order of the parameters of methods.
    
**Code11:[MethodOverloading2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MethodOverloading2.java):** A program to illustrate method overloading by changing the order of parameters in the methods.

**Code12:[NullError.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/NullError.java):** In this Code the method arguments Integer and String both are not primitive data types in Java. That means they accept null values. When we pass a null value to the method1 the compiler gets confused which method it has to select, as both are accepting the null.

**Code13:[NullErrorSolution.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/NullErrorSolution.java):** A Solution to the problem which occured in **Code12**.

**Code14:[MainOverloading.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MainOverloading.java):** A program to illustrate overloading main method.

**Code15:[Varargs.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/Varargs.java):** A variable-length argument is specified by three periods(…).This syntax tells the compiler that a method varargs( ) can be called with zero or more arguments. As a result, here x is implicitly declared as an array of type int[].

**Code16:[VarargsMethodOverloading.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/VarargsMethodOverloading.java):** A Program to show method Overloading in methods with variable-length argument.

**Code17:[AmbiguousVarargsMethodOverloading.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/AmbiguousVarargsMethodOverloading.java):** A Program to illustrate ambiguity while overloading method with variable-length arguments.

There are 3 phases used in overload resolution: First phase performs overload resolution without permitting boxing or unboxing conversion, Second phase performs overload resolution while allowing boxing and unboxing and Third phase allows overloading to be combined with variable arity methods, boxing, and unboxing. If no applicable method is found during these phases, then ambiguity occurs.

### METHOD OVERRIDING:

When a method in a subclass has the same name, same parameters declaration and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

**Code18:[MethodOverriding1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MethodOverriding1.java):** A simple program to demonstrate Method overriding in java.

**Code19:[MethodOverriding2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MethodOverriding2.java):**  The access modifier for an overriding method can allow more, but not less, access than the overridden method. For example, a protected instance method in the super-class can be made public, but not private, in the subclass. Doing so, will generate compile-time error.

Private methods cannot be overridden as they are bonded during compile time. Therefore we can’t even override private methods in a subclass.

It is possible to have different return type for a overriding method in child class, but child’s return type must be sub-type of parent class’ return type. This is known as covariant return type.

**Code20:[MethodOverriding3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/MethodOverriding3.java):** A program to demonstrate that parent class overriden method can be called in overriding method of sub class using super keyword.

**Code21:[EqualsOverriding.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/EqualsOverriding.java):** A program which overrides equals() method of Object class of java to find if two different objects of a same class are equal or not.

### DYNAMIC METHOD DISPATCH/RUN-TIME POLYMORPHISM:

Method Overriding is one of the ways in which Java supports Run-time polymorphism.Dynamic Method Dispatch is a process in which a call to a overriden method is resolved during runtime rather than compile time.

1.When an overriden method is called by superclass reference,Java determines which version of the method is to be executed depending on the type of object being reffered to at the time of calling.Thus this determination is made during run-time.

2.At run-time,it depends on the type of the object being reffered to which determines the version of the overriden method to be executed.

3.A superclass reference variable reffering to a subclass object is known as upcasting.

**Code22:[DynamicMethodDispatch1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Methods/DynamicMethodDispatch1.java):** A Java program to illustrate Dynamic Method Dispatch using hierarchical inheritance.

In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be achieved by data members.

The **java.lang.System.exit()** method exits current program by terminating running Java virtual machine. This method takes a status code. 
             
             exit(0) : Generally used to indicate successful termination.
             exit(1) or exit(-1) or any other non-zero value – Generally indicates unsuccessful termination. 


# CONSTRUCTORS:

Constructors are used for initializing new objects. Constructors does not return any values but implicitly it returns the object of the class. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.

**PACKAGE:[Constructors](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Constructors)**

**Constructors cannot be Inherited:**

When a class extends another class,the child class inherits the variables ,methods and the behaviour of the super class but not the constructors.Constructors have same name as the class name. So if constructors were inherited in child class then child class would contain a parent class constructor which is against the constraint that constructor should have same name as class name.

**Default Constructors:**

Java creates a default constructor automatically if no default or parameterized constructor is created by user.The default constructor in java initializes the member data variables to default values

**Code1:[DefaultContructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Constructors/DefaultConstructor.java):** A program to illustrate the behaviour of default constructors.

**Copy Constructor:**
Java supports copy constructor but doesn't create a default copy of constructor if user doesn't create one.

**Code2:[CopyConstructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Constructors/CopyConstructor.java):** A program to illustrate the use of copy constructor

### CONSTRUCTOR CHAINING:

Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

  1.**Within same class:** It can be done using this() keyword for constructors in same class.See  [this2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this2.java)
    
  2.**From base class:** by using super() keyword to call constructor from the base class.See [superWithConstructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Super%20keyword/superWithConstructor.java)

This process is used when we want to perform multiple tasks in a single constructor. Rather than creating a code for each task in a single constructor we create a separate constructor for each task and make their chain which makes the program more readable.

**Points to be noted:**

    1.The this() expression should always be the first line of the constructor.
    2.There should be at-least be one constructor without the this() keyword.
    3.Constructor chaining can be achieved in any order.

### PRIVATE CONSTRUCTORS AND SINGLETON CLASS:

We can provide access specifier to the constructor. If made private, then it can only be accessed inside the class.
We can use private constructors for 1. Internal Constructor Chaining 2. Singleton class design

A singleton class is a class that can have not more than a single object.
After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to a variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any instance of that class.

**Code3:[PrivateConstructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Constructors/PrivateConstructor.java):** A program to illustrate singleton class using Private constructor.

To design a singleton class:

    1.Make constructor as private.
    2.Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.

## CONSTRUCTORS VS METHODS:

Constructors in Java can be seen as Methods in a Class. But there is a big difference be tween Constructors and Methods.

1.Constructors have only one purpose, to create an Instance of a Class. This instantiation includes memory allocation and member initialization (Optional).

By contrast, Methods cannot be used to create an Instance of a Class.

2.Constructors cannot have Non Access Modifiers while Methods can.

3.Constructors cannot have a return type(Including void) while Methods require it.

4.The Constructor name must be the same as the Class name while Methods are not restricted.

5.As per Java naming convention, Method names should be camelcase while Constructor names should start with capital letter.

### CONSTRUCTOR OVERLOADING:

In java,it is possible to define two or more constructor of the same class that obviously share the same name but their parameter declaration are different either in terms of number of parameters or type of the parameters or both.This process is called Constructor Overloading.

**Code4:[ConstructorOverloading.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Constructors/ConstructorOverloading.java):** Java program to demostrate constructor overloading.

See more on contructors: [Rules And Properties of Constructor](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Classes%20and%20objects/RulesAndPropertiesOfConstructor.txt)

# ENCAPSULATION:

Encapsulation is the mechanism that binds together code and the data it manipulates.Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

    1.Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
    2.As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
    3.Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

**Code 2::[Encapsulation.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Encapsulation.java):** Java Program to illustrate encapsulation.

#### Advantages of Encapsulation:

1.**Data Hiding:** The user will have no idea about the inner implementation of the class. It will not be visible to the user that how the class is storing values in the variables. He only knows that we are passing the values to a setter method and variables are getting initialized with that value.

2.**Increased Flexibility:** We can make the variables of the class as read-only or write-only depending on our requirement. If we wish to make the variables as read-only then we have to omit the setter methods like setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge() etc. from the above program.
  
3.**Reusability:** Encapsulation also improves the re-usability and the code becomes easy to change with new requirements.

4.**Testing code:** Encapsulated code is easy to test for unit testing.

# PACKAGES:

A package is a container within which we can store multiple classes,subpackages and interfaces.A package is a container of a group of related classes where some of the classes are accessible are exposed and others are kept for internal purpose.

Packages are used for:

    1.Avoiding namespace collision ie Preventing naming conflicts.Thus there can be two classes of same name in two different packages.
    2.Searching and using classes, interfaces, enumerations and annotations becomes easier
    3.Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.
    4.Packages can be considered as data encapsulation (or data-hiding).

**How packages work?**

If a package name is college.dept.cse, then there are three directories, college, dept and cse such that cse is present in dept and dept is present college. Also, the directory college is accessible through **CLASSPATH** variable, i.e., path of parent directory of college is present in CLASSPATH. The idea is to make sure that classes are easy to locate.We can add more classes to a created package by using package name at the top of the program and saving it in the package directory. We need a new java file to define a public class, otherwise we can add the new class to an existing .java file and recompile it.

                // import the Vector class from util package.
               import java.util.vector; 

                // import all the classes from util package
               import java.util.*; 
                // All the classes and interfaces of this package
                // will be accessible but not subpackages.
                import package.*;

                // Only mentioned class of this package will be accessible.
                import package.classname;

                // Class name is generally used when two packages have the same
                // class name. For example in below code both packages have
                // date class so using a fully qualified name to avoid conflict
                import java.util.Date;
                import my.packag.Date;

Packages can be of two types:

**Built-in Packages:**

These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:
1) **java.lang:** Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.

2)  **java.io:** Contains classed for supporting input / output operations.

3)  **java.util:** Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.

4)  **java.applet:** Contains classes for creating Applets.

5)  **java.awt:** Contain classes for implementing the components for graphical user interfaces (like button , menus etc).

6)  **java.net:** Contain classes for supporting networking operations.

**Points to be noted:**

    1.Every class is part of some package.
    2.If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for all files).
    3.All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.
    4.If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the package name).
    5.We can access public classes in another (named) package using: package-name.class-name

**User-defined packages:**

These are the packages that are defined by the user. First we create a directory with the desired package name (name should be same as the name of the package). Then we create the desired class inside the directory with the first statement being the package names.

Static import is a feature introduced in Java programming language ( versions 5 and above ) that allows members ( fields and methods ) defined in a class as public static to be used in Java code without specifying the class in which the field is defined.

**Code3::[StaticImport.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/StaticImport.java):** A program to illustrate how Static import works.

# INTERFACES:

Interface looks like a class and has variables and methods declaration like that of a class but it doesnot contain any method definition.


    1.Interfaces specify what a class must do and not how. It is the blueprint of the class.
    2.An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
    3.If a class implements an interface and does not provide method bodies for all functions specified in the interface, then class must be declared abstract.
    4.A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

**Use of Interface:**

  1.It is used to achieve total abstraction.
  
  2.Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
  
  3.It is also used to achieve loose coupling.
  
  4.It provides boundness to the program.
  
  5.Abstract classes may contain non-final variables, whereas variables in interface are final, public and static.
  
 **PACKAGE:[Interface](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Interface):**
 
 **Code1:[Interface1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/Interface1.java):** A simple java program to illustrate use of Interface.

**Code2:[Interface2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/Interface2.java):** A simple program to show that we can now define static methods in interfaces(JDK 8 onwards) which can be called independently without an object.These methods are not inherited. 

Read more on Interface **[here](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/MoreAboutInterface.txt)**

Inheritence can be extended or inherited.

**Code3:[Interface3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/Interface3.java):** A Java program to show Interface can be extended.

# Abstract class:
A class with a pure virtual function ie, an abstract method is termed as Abstract class.In java, however the class has to be declared with abstract keyword to make it Abstract.

**Code4:[AbstractClass1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/AbstractClass1.java):** A program to illustrate use of Abstract class.

**Code5:[Abstractclass2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/Abstractclass2.java):** A program to show that java allows abstract classes without any abstract method in it.
### ABSTRACT CLASS VS INTERFACE:

|**PROPERTIES**|**ABSTRACT CLASS**|**INTERFACE**|
|:------------:|:----------------:|:-----------:|
|**Methods**|Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.|Interface can have only abstract methods.|
|**Variables**|An abstract class can have final,non-final,static,non-static variables.|Variables declared in a Java interface are by default final.Interface can have only static and final variables.|
|**Implementation**|Abstract class can provide the implementation of interface.|Interface can’t provide the implementation of abstract class.|
|**Inheritance vs Abstraction**|Abstract class can be extended using keyword “extends”.|A Java interface can be implemented using keyword “implements” |
|**Multiple implementation**|An abstract class can extend another Java class and implement multiple Java interfaces.|An interface can extend another Java interface only.|
|**Accessibility of Data Members**|A Java abstract class can have class members with access as private, protected, etc.|Members of a Java interface are public by default|

### NESTED INTERFACE:

Interfaces declared as member of a class or another interface are called member interface or nested interface.

**Code6:[NestedInterface1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/NestedInterface1.java):** Java program to demonstrate working of interface inside a class. 

**Code7:[NestedInterface2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/NestedInterface2.java):** // Java program to demonstrate protected specifier for nested interface. 

**Code8:[NestedInterface3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/NestedInterface3.java):** Java program to demonstrate working of interface inside another interface. 

**Code9:[NestedInterface4.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Interface/NestedInterface4.java):** Java program to demonstrate an interface cannot have non-public member interface. 

# NESTED CLASSES:

When a class is defined within another class, such classes are known as nested classes.


    1.The scope of a nested class is bounded by the scope of its enclosing class. Thus in above example, class NestedClass does not exist independently of class OuterClass.
    2.A nested class has access to the members, including private members, of the class in which it is nested. However, reverse is not true i.e. the enclosing class does not have access to the members of the nested class.
    3.A nested class is also a member of its enclosing class.
    4.As a member of its enclosing class, a nested class can be declared private, public, protected, or package private(default).
    
Nested classes are divided into two categories:

        1.static nested class : Nested classes that are declared static are called static nested classes.A static nested class cannot refer directly to instance variables or methods defined in its enclosing class.It can use them only through an object reference.They are accessed using the enclosing class name.
        2.inner class : An inner class is a non-static nested class.Inner class has access to all members(static and non-static variables and methods, including private) of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
Inner class are of two categories:

        1.Local Inner class: When an inner class is defined inside a block generally the method of the Outer Class or sometimes a for loop or if clause then it becomes local inner class.Local inner classes cannot have any access modifiers associated with them. However, they can be marked as final or abstract. These class have access to the fields of the class enclosing it. Local inner class must be instantiated in the block they are defined in.

        2.Anonymous Inner class:It is an inner class without a name and for which only a single object is created.
        
**PACKAGE:[NestedClass](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/NestedClass):**

**Code1:[NestedClass1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/NestedClass/NestedClass1.java):** A Java Program to illustrate static nested class.

**Code2:[NestedClass2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/NestedClass/NestedClass2.java):** A Java Program to illustrate non-static nested class(inner class).

**Code3:[NestedClass3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/NestedClass/NestedClass3.java):** A Java Program to illustrate local inner class inside a method.

**Code4:[NestedClass4.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/NestedClass/NestedClass4.java):** A Java Program to illustrate local inner class inside an if clause.

**Code5:[NestedClass5.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/NestedClass/NestedClass5.java):** A Java Program to illustrate anonymous inner class.


**JAVA ACCESS MODIFIERS:**

|           | **PRIVATE**|**DEFAULT**|**PROTECTED**|**PUBLIC**|
|:---------:|:----------:|:---------:|:-----------:|:--------:|
|**WITHIN SAME CLASS**|YES|YES|YES|YES|
|**FROM ANY CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY NON-SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB-CLASS FROM DIFFERENT PACKAGE**|NO|NO|YES|YES|
|**FROM ANY NON-SUB CLASS FROM DIFFERENT PACKAGE**|NO|NO|NO|YES|


# INHERITANCE:

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

**PACKAGE:[Inheritence](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Inheritence):** 

**Code1: [ObjectCreation.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Inheritence/ObjectCreation.java):** Code shows that super class and sub class constructors refer to the same objects.

**Code2: [SingleInheritence.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Inheritence/SingleInheritence.java):** Code to demostrate how Single Inheritence works.

**Code3: [MultilevelInheritence.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Inheritence/MultilevelInheritence.java):** Code to demonstrate how Multilevel Inheritence works.

**Code4: [HierarchicalInheritance.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Inheritence/HierarchicalInheritance.java):** Code to demonstrate how Hierarchical Inheritance works.

# this KEYWORD:

'this' works as a reference to the current object, whose method or constructor is being invoked. This keyword can be used to refer to any member of the current object from within an instance method or a constructor.

**PACKAGE: [this keyword](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/this%20keyword)**:

**Code1: [this1.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this1.java):** this used to refer current class instance variables.

**Code2: [this2.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this2.java):** used to invoke current class constructor.This code is an example of **Constructor chaining using this()** discussed above.

**Code3: [this3.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this3.java):** used to invoke current class instances.

**Code4: [this4.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this4.java):** used as method parameter.

**Code5: [this5.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this5.java):** used to invoke current class method.

**Code6: [this6.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/this%20keyword/this6.java):** used as an argument in constructor call.

# super KEYWORD:

The super keyword in java is a reference variable that is used to refer parent class objects.

**PACKAGE:[super KEYWORD](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/tree/master/Super%20keyword):**

**Code1:[superWithConstructor.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Super%20keyword/superWithConstructor.java):** 'super' keyword can also be used to access the parent class constructor.'super' can call both parametric as well as non parametric constructors depending upon the situation.This code is also an example of **Constructor chaining with super()** discussed above.

**Code2:[superWithMethods.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Super%20keyword/superWithMethods.java):** A program to illustrate that whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.

**Code3:[superWithVariables.java](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Super%20keyword/superWithVariables.java):** A Program to illustrate how use of 'super' with data member of parent class can avoid ambiguity if derived class and parent class has same data members.


# MULTITHREADING:

Most programming languages do not enable programmers to specify concurrent activities.Java makes concurrency available to the programmers through APIs.The programmer specifies that applications contain thread of execution,where each thread designates a portion of a program that may execute concurrently with other threads.This capability of java is called multithreading.

**Example**:When programs download large files such as an audio file over the internet,users may not want to wait until entire lengthy file downloads before starting the playback.To solve this,we can put multiple threads to work-one thread downloads the clip and another plays it.

Java's garbage collection is also an example of multithreading. 

### Thread States :Life Cycle Of A Thread:

![](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/snapshots/Thread_life_cycle.jpg)


A ***new*** thread begins its life cycle in the ***new*** state.It remains in this state until the program starts the thread,which places the thread in the ***runnable*** state.A thread in this state is considered to be executing its task.

Sometimes a thread transitions to the **waiting** state while the thread waits for another thread to perform a task.Once in this state,a thread transitions back to the ***runnable*** state only when another thread signals the ***waiting*** thread to continue executing. 

A ***runnable*** thread can enter the **timed waiting** state for a specified interval of time.A thread in this state transitions back to the ***runnable*** state when it is signalled by another thread or that time interval expires or when the event it is waiting for occurs-whichever comes first.***Timed waiting*** threads cannot  use a processor,even if one is available.A thread can transition to the ***timed waiting*** state if it provides an optional wait interval when it is waiting for another thread to perform a task.Another way a thread can end up in ***timed waiting*** state is when a thread is put to sleep.A sleeping thread remains in ***timed waiting*** state for a designated period of time(called a sleep interval) at which point it returns to the runnable state.

A runnable thread enters ***terminated*** state when it completes its task or otherwise terminates due to some error condition. In the UML state diagram above, the ***terminated*** state is followed by the UML final state to indicate end of the state transitions.
See **[code1](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Multithreading/Multithreading4.java)** and **[code2](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Multithreading/Multithreading5.java)**

Threads can be created by using two mechanisms :
1. **Extending the Thread class**:We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.See **[code](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Multithreading/Multithreading2.java)**

2. **Implementing the Runnable Interface**:We create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object.See **[code](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Multithreading/Multithreading3.java)**

### Thread Class vs Runnable Interface

1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.

### THREAD PRIORITIES:

Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.Informally,threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads.

        public static int MIN_PRIORITY: This is minimum priority that a thread can have. Value for this is 1.
        public static int NORM_PRIORITY: This is default priority of a thread if do not explicitly define it. Value for this is 5.
        public static int MAX_PRIORITY: This is maximum priority of a thread. Value for this is 10.

**public final int getPriority()**: java.lang.Thread.getPriority() method returns priority of given thread.

**public final void setPriority(int newPriority)**: java.lang.Thread.setPriority() method changes the priority of thread to the value newPriority. This method throws IllegalArgumentException if value of parameter newPriority goes beyond minimum(1) and maximum(10) limit.

**isAlive():** Returns true or false based on whether Thread is alive or not. See **[Code](https://github.com/disha2sinha/Object-Oriented-Programming-in-Java/blob/master/Multithreading/MultiThreading6.java)**




