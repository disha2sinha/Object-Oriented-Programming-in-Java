import java.io.*;

class Person {
    static Person name = null;
    public int age = 12;

    // private constructor can't be accessed outside the class
    private Person() {
    }

    // Factory method to provide the users with instances
    static public Person getInstance() {
        // to ensure only one instance is created
        if (name == null)
            name = new Person();

        return name;
    }
}

class PrivateConstructor{
    public static void main(String args[]) {
        Person a = Person.getInstance();
        Person b = Person.getInstance();
        a.age = a.age + 10;
        System.out.println("Value of a.age = " + a.age);
        System.out.println("Value of b.age = " + b.age);
        // We changed value of a.age, value of b.age also got updated because both ‘a’
        // and ‘b’ refer to same object, i.e., they are objects of a singleton class.
    }
}