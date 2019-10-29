class A {
    int a;

    A(int i) {
        a = i;
    }
}

public class PassingObjects2 {
    public static void main(String[] args) {

        A obj = new A(100);
        change(obj);
        System.out.println("a=" + obj.a);
    }

    static void change(A obj1) {
        obj1.a=10;
    }

}