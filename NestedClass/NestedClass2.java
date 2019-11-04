package NestedClass;

class OuterClass {
    // static
    static int x_static;
    // nonstatic
    int x_nons;
    // private static
    private static int x;

    private int x_pri;

    OuterClass(int a, int b, int c, int d) {
        x_static = a;
        x_nons = b;
        x = c;
        x_pri = d;
    }
    // static nested class

    class Inner {

        void display() {
            System.out.println("static int" + x_static);
            System.out.println("Private static int" + x);
            System.out.println("Nonstatic Integer" +x_nons);// cannot be accessed directly
            System.out.println("Nonstatic Private integer" +x_pri);// cannot be accessed directly
        }
    }
}

/**
 * NestedClass1
 */
class NestedClass2 {

    public static void main(String[] args) {
        //accessing Inner class
        OuterClass obj = new OuterClass(10, 20, 30, 40);

        OuterClass.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}