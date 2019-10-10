class Box {
    double width;
    double height;
    double depth;

    //Constructor declaration
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method1
    double volume() {
        return width * height * depth;
    }

}

class Constructor {
    public static void main(String args[]) {
        // invoking constructor
        Box obj1 = new Box(3,5,10);
        // invoking constructor
        Box obj2 = new Box(10,15,20);
        System.out.println("Vol of Box1:" + obj1.volume());
        System.out.println("Vol of Box2:" + obj2.volume());
    }
}