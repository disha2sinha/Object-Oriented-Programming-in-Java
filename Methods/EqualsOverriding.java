import javax.lang.model.util.ElementScanner6;

class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object o)
    {
        // If the object is compared with itself then return true
        if (o==this)
        {
            return true;
        }
        //Check if o is an instance of Person1 or not
        if (!(o instanceof Person1))
        {
            return false;
        }
        // typecast o to Person1 so that we can compare data members
        Person1 p=(Person1) o;
        return name.equals(p.name) == true && Integer.compare(age, p.age) == 0;

    }
}

class EqualsOverriding
{
    public static void main(String[] args) {
        
        Person p1=new Person("Disha",22);
        Person p2 = new Person("Disha",22);
        if (p1==p2)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        System.out.println("The reason for printing “Not Equal” is simple: when we compare p1 and p2, it is checked whether both p1 and p2 refer to same object or not.p1 and p2 refer to two different objects, hence the value (p1 == p2) is false. If we create another reference say p3 like following, then (p1 == p3) will give true.\nPerson p3 = p1");
        
        System.out.println("After Overriding equals() method");
        Person1 p11=new Person1("Disha",22);
        Person1 p21 = new Person1("Disha",22);
        if(p11.equals(p21))
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }

}