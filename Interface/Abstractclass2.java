package Interface;
abstract class Parent
{
    void meth()
    {
        System.out.println("No abstract method");
    }
}

class Child extends Parent
{

}

class Abstractclass2 {

    public static void main(String[] args) {
        Child c=new Child();
        c.meth();
    }
}