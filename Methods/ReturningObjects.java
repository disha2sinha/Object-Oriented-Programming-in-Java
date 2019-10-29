class Test
{
    int x;
    Test(int a)
    {
        x=a;
    }
    Test MultiplybyTen()
    {
        Test obj=new Test(x*10);
        return obj;
    }
}
class ReturningObjects {
    public static void main(String[] args) {
        Test obj=new Test(100);
        Test obj1;
        obj1=obj.MultiplybyTen();
        System.out.println("obj.x="+obj.x);
        System.out.println("obj1.x=" + obj1.x);
        obj1=obj1.MultiplybyTen();
        System.out.println("new obj1.x=" + obj1.x);

    }
    
}