class Blocks{
    //creating an anonymous blocks
    {
        System.out.println("Inside Anonymous Block");
    }
    //creating a static block
    static{
        System.out.println("Inside Static Block");
    }

    //creating constructor of class
    Blocks(){
        System.out.println("Inside Constructor");
    }
}
class OrderOfExecution{
    //creating an object of class blocks
    public static void main(String args[]){
        Blocks obj=new Blocks();
        System.out.println("**************");
        //creating another object of class Blocks
        Blocks obj1=new Blocks();
    }
}