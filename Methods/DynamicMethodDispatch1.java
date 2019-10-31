class A {
    A() {
        System.out.println("A's Constructor");
    }

    void method() {
        System.out.println("A's Method");
    }
}

class B extends A {
    B() {
        System.out.println("B's Constructor");
    }

    void method() {
        System.out.println("B's Method");
    }
}

class C extends A {
    C() {
        System.out.println("C's Constructor");
    }

    void method() {
        System.out.println("C's Method");
    }

}

class DynamicMethodDispatch1 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        // obtain a reference of type A
        A ref;

        // ref refers to an A object
        ref = a;

        // calling A's version of m1()
        ref.method();

        // now ref refers to a B object
        ref = b;

        // calling B's version of m1()
        ref.method();

        // now ref refers to a C object
        ref = c;

        // calling C's version of m1()
        ref.method();
    }
}