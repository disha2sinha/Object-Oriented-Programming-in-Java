class Test
{
    int a,b;
    Test(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equals(Test obj)
    {
        if (obj.a==a && obj.b==b)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
public class PassingObjects3 {
    public static void main(String[] args) {
        Test obj1=new Test(100, 3);
        Test obj2= new Test(100, 3);
        Test obj3 = new Test(30,40);
        System.out.println("obj1==obj2:"+obj1.equals(obj2));
        System.out.println("obj2==obj3:" + obj2.equals(obj3));
        System.out.println("obj3==obj1:" + obj3.equals(obj1));
        
    }
    
}