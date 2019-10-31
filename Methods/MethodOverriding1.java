class A {
    int i, j;

    A() {

    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void Showij() {
        System.out.println("A's i=" + i);
        System.out.println("A's j=" + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
    }

    void Showij() {
        System.out.println("B's i=" + i);
        System.out.println("B's j=" + j);

    }
    
    void Showk() {
        System.out.println("k=" + k);
    }
}

/**
 * SingleInheritence
 */
class MethodOverriding1 {
    public static void main(String[] args) {
        //If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // Showij is called 
        A obj=new A(20,30);
        obj.Showij();
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.

        A obj1=new B(12,45,78);
        obj1.Showij();
        B subobj=new B(5,10,15);
        subobj.Showij();
        subobj.Showk();
    }
}
