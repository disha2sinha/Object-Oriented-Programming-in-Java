
//Java code for using 'this' keyword to refer current class instance variables 
class Test {
    int a;
    int b;

    // Parameterized constructor
    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        // Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }
}
class this1{
    public static void main(String[] args) {
        Test object1 = new Test(10, 20);
        object1.display();
        Test object2 = new Test(30, 40);
        object2.display();
    }
}
