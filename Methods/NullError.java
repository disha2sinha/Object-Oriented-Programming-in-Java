class Test
{
    void nullError(String name)
    {
        System.out.println("name:"+name);
    }
    void nullError(Integer i)
    {
        System.out.println("integer:"+i);
    }
}
class NullError {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.nullError(null);
    }
    
}