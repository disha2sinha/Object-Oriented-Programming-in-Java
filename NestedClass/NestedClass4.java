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
    void show(){
    if (x_nons>20) {
        class Inner {

            void display() {
                System.out.println("static int" + x_static);
                System.out.println("Private static int" + x);
                System.out.println("Nonstatic Integer" + x_nons);// cannot be accessed directly
                System.out.println("Nonstatic Private integer" + x_pri);// cannot be accessed directly
            }
        }
        Inner obj = new Inner();
        obj.display();
    }
    else{
        System.out.println("No inner class");
    }
}     
}

/**
 * NestedClass3
 */
class NestedClass4 {

    public static void main(String[] args) {
        // accessing Inner class
        OuterClass obj1 = new OuterClass(10, 20, 30, 40);
        obj1.show();
        OuterClass obj2 = new OuterClass(10, 50, 30, 40);
        obj2.show();
        // Inner inner = new Inner();
        //System.out.println(inner.display());will generate compilation error as inner class can be accessed only inside the block it belongs to

    }
}
