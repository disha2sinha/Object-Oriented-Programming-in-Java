package Interface;
interface Callback {
    void call(int person);

}

class Client implements Callback {
    public void call(int p) {
        System.out.println("Call p:" + p);
    }

    void nonInterface() {
        System.out.println("NonInterface method");
    }
}

class AnotherClient implements Callback {
    public void call(int p) {
        System.out.println("p*p=" + (p * p));
    }
}

public class Interface1 {

    public static void main(String[] args) {
        Callback c = new Client();
        c.call(43);
        // c.nonInterface(); will generate error as the reference variable is not class
        // type.
        Client ob = new Client();
        ob.nonInterface();
        AnotherClient obj = new AnotherClient();
        c = obj;
        c.call(9);

    }
}