class Box{
    double width;
    double height;
    double depth;

    //Method1
    double volume(){
        return width*height*depth;
    }
    //Method2
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}
class Creatingobjects1{
    public static void main(String args[]){
        //creating object1 of Class Box
        Box obj1=new Box();
        //creating object2 of Class Box
        Box obj2=new Box();
        obj1.setDim(3,5,10);
        obj2.setDim(10,15,20);
        System.out.println("Vol of Box1:"+obj1.volume());
        System.out.println("Vol of Box2:"+obj2.volume());
    }
}