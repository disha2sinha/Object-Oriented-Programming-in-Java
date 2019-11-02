
// Java code for using this() to  
// invoke current class constructor 
class Test {
    int a;
    int b;

    // Default constructor
    Test() {
        this(10, 20); //constructor chaining
        System.out.println("Inside  default constructor \n");
    }

    // Parameterized constructor
    Test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
}
class this2{
    public static void main(String[] args) {
        Test object = new Test();
    }
}
