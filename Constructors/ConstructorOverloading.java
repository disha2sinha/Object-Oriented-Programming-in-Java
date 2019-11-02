class person
{
    int age;
    double height;
    double weight;
    person()
    {
        System.out.println("No parameterized constructor");
        age=0;
        height=0.0;
        weight=0.0;
    }
    person(int age)
    {
        System.out.println("One Parameter Constructor");
        this.age=age;
        height=0.0;
        weight=0.0;
    }
    person(int age,double height)
    {
        System.out.println("Two parameter Constructor");
        this.age=age;
        this.height=height;
        weight=0.0;
    }
    
    person(int age, double height,double weight) {
        System.out.println("Three parameter Constructor");
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return "Age:"+age+"\tHeight"+height+"\tWeight"+weight;
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {
        person p1=new person();
        System.out.println(p1);
        person p2=new person(22);
        System.out.println(p2);

        person p3=new person(22,5);
        System.out.println(p3);

        person p4=new person(22,5,65);
        System.out.println(p4);

    }
    
}
