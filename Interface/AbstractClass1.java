package Interface;

abstract class Parent {
    //optional
    Parent()
    {
        System.out.println("Parent Constructor called");
    }
    abstract void meth();
    //Abstract class can also have final methods
    final void meth2()
    {
        System.out.println("final method called");
    }
}

class child extends Parent{
    child()
    {
        System.out.println("Child class constructor called");
    }
    void meth()
    {
        System.out.println("abstract method");
    }
}
class AbstractClass1 {
    public static void main(String[] args) {
        child c =new child();
        c.meth();
        c.meth2();
        Parent p=new child();
        p.meth();
        p.meth2();        

    }
    
}