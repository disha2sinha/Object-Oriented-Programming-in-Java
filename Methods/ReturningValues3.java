import java.util.*;
class Test
{
    List<Object> getValues()
    {
        String name="Disha";
        int rno=75;
        int height=5;
        return Arrays.asList(name,rno,height);
    }
}
public class ReturningValues3 {
    public static void main(String[] args) {
    
        Test obj=new Test();
        List<Object> person= obj.getValues();
        System.out.println("Name:"+person.get(0));
        System.out.println("Roll Number:" + person.get(1));
        System.out.println("Height:" + person.get(2));

    }
    

}
