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
        super.Showij();
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
class MethodOverriding3 {
    public static void main(String[] args) {
        A obj1 = new B(12, 45, 78);
        obj1.Showij();
        B subobj = new B(5, 10, 15);
        subobj.Showk();
    }
}
