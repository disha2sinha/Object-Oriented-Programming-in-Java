class Box
{
    int length,box_no;
    Box(int l,int no)
    {
        length=l;
        box_no=no;
    }
    void characteristics()
    {
        System.out.println("Box no.:"+box_no+" ; length of box:"+length);
    }
}

class SwapObjects2Problem
{
    public static void swap(Box mybox1,Box mybox2) {
        Box temp=mybox1;
        mybox1=mybox2;
        mybox2=temp;
    }
    public static void main(String[] args) {
        Box box1=new Box(34, 1);
        Box box2= new Box(84, 2);
        swap(box1,box2);
        box1.characteristics();
        box2.characteristics();
    }
}
