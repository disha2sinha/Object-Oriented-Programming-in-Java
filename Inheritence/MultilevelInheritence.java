class A{
    A(){
        System.out.println("A's Constructor");
    }
    void methodA()
    {
        System.out.println("A's Method");
    }
}

class B extends A{
    B()
    {
        System.out.println("B's Constructor");
    }
    void methodB()
    {
        System.out.println("B's Method");
    }

}

class C extends B{
    C(){
       System.out.println("C's Constructor"); 
    }
    void methodC()
    {
        System.out.println("C's Method");
    }

}

class MultilevelInheritence{
    public static void main(String[] args) {
        C c=new C();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}