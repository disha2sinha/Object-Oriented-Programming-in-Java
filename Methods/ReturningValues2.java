class Test
{
    int a;
    int b;
    int c;
    Test(int i,int j,int k)
    {
        a=i;
        b=j;
        c=k;
    }
}
public class ReturningValues2 {
    static Test getValues()
    {
        return new Test(10,20,50);
    }
    public static void main(String[] args) {
        getValues();
        System.out.println("a="+getValues().a);
        System.out.println("b=" + getValues().b);
        System.out.println("c="+getValues().c);
    }
}