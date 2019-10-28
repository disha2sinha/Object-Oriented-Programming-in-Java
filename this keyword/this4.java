class Test {
    int a;
    int b;

    // Default constructor
    Test() {
        a = 100;
        b = 200;
    }

    // Method that receives 'this' keyword as parameter
    void display(Test obj) {
        System.out.println("a = " + a + "  b = " + b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }
}
class this4{

    public static void main(String[] args) {
        Test object = new Test();
        object.get();
    }
}