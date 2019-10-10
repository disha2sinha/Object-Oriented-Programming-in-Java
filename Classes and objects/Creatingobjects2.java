class Box{
    double width;
    double height;
    double depth;
}
class Creatingobjects2{
    public static void main(String args[]) {

        //Creating object of class Box
        Box mybox=new Box();
        mybox.width=5;
        mybox.height=10;
        mybox.depth=20;
        double vol=mybox.width*mybox.height*mybox.depth;
        System.out.println("Volume is:"+vol);
    }
}