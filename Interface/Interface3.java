package Interface;

interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
/**
 * Interface3
 */
class Ifaceclass implements B {
    public void meth1(){
        System.out.println("Implement meth1()");
        
    }
    public void meth2()
    {
        System.out.println("Implement meth2()");
    }
    public void meth3() {
        System.out.println("Implement meth3()");
    }
}
/**
 * Interface3
 */
class Interface3 {
    public static void main(String[] args) {
        Ifaceclass obj=new Ifaceclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
    
}