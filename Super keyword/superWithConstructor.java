class Box{
    double width,height,depth;
    Box(double w, double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class Boxweight extends Box
{
    double weight;
    Boxweight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
}
class superWithConstructor {
    public static void main(String[] args) {
        Boxweight obj=new Boxweight(10, 23, 9, 45);
        System.out.println("Box Volume="+obj.volume());
        System.out.println("Box Weight="+obj.weight);
    }
    
}