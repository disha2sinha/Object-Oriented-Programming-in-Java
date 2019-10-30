class Test
{
    void id(String name,int id)
    {
        System.out.println("Name:"+name+"\tId:"+id);
    }
    void id(int id,String name)
    {
        System.out.println("Name:" + name + "\tId:" + id);

    }
}
public class MethodOverloading2 {

    public static void main(String[] args) {
        Test obj=new Test();
        obj.id("Disha",101);
        obj.id(102,"Argha");
    }
}