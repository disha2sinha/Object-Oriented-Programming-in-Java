class Test {

    void display() {
        // calling fuction show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }
}
class this5{

    public static void main(String args[]) {
        Test t1 = new Test();
        t1.display();
    }
}