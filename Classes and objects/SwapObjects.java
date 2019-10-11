class Box
{
    int box_no;
    Box(int no)
    {
        box_no=no;
    }
}
class SwapObjects
{
    public static void swap(Box mybox1,Box mybox2)
    {
        int temp=mybox1.box_no;
        mybox1.box_no=mybox2.box_no;
        mybox2.box_no=temp;
    }
    public static void main(String[] args) {
        Box box1=new Box(1);
        Box box2=new Box(2);
        swap(box1,box2);
        System.out.println("Box 1 number:"+box1.box_no);
        System.out.println("Box 2 number:" + box2.box_no);

    }
}