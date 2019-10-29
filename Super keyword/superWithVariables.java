class A{
    int i=10;
}
class B extends A{
    int i;
    B(int a)
    {
        i=a;
    }
    void display()
    {
        System.out.println("Class A i="+super.i);
        System.out.println("class B i="+i);
    }
}
class superWithVariables {
    public static void main(String[] args) {
        
    B obj=new B(20);
    obj.display();
    }
    
}