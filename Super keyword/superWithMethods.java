class A{
    int i;
    void display()
    {
        System.out.println("Class A i="+i);
    }
}
class B extends A{
    int j;
    B(int a,int b)
    {
        super.i=a;
        j=b;
    }
    void display()
    {
        super.display();
        System.out.println("Class B j="+j);
    }
}

class superWithMethods {
    public static void main(String[] args) {
        B obj=new B(10,80);
        obj.display();
    }
    
}