class A
{
    int i,j;
    A()
    {

    }
    A(int a,int b)
    {
        i=a;
        j=b;
    }
    void Showij()
    {
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
class B extends A{
    int k;
    B(int a,int b,int c)
    {
        i=a;
        j=b;
        k=c;
    }
    void Showk()
    {
        System.out.println("k=" + k);
    }
}

/**
 * SingleInheritence
 */
public class SingleInheritence {
    public static void main(String[] args) {
        //when an object of B class is created, a copy of the all methods and fields of the superclass acquire memory in this object. That is why, by using the object of the subclass we can also access the members of a superclass.
        //During inheritance only object of subclass is created, not the superclass
        B subobj=new B(5,10,15);
        subobj.Showij();
        subobj.Showk();
    }
    
}