//A java Program to demostrate wrapper class to swap objects of a car
class Box
{
    int no;
    float length;
    float depth;
    float width;
    Box(int n,float l,float d,float w)
    {
        no=n;
        length=l;
        depth=d;
        width=w;
    }
    void characteristics()
    {
        System.out.println("Box Number:"+no+" Length:"+length+" Depth:"+depth+" Width:"+width);
    }
}

//Wrapper class
class BoxWrapper
{
    Box myBox;
    BoxWrapper(Box obj)
    {
        myBox=obj;
    }
}

/**
 * SwapObjects2Solution
 */
public class SwapObjects2Solution {

    public static void swap(BoxWrapper mybox1,BoxWrapper mybox2) {
        Box temp=mybox1.myBox;
        mybox1.myBox=mybox2.myBox;
        mybox2.myBox=temp;
    }
    public static void main(String[] args) {
        Box box1=new Box(1,30f,45.5f,67.8f);
        Box box2=new Box(2,57f,90f,10f);
        BoxWrapper boxw1=new BoxWrapper(box1);
        BoxWrapper boxw2=new BoxWrapper(box2);
        swap(boxw1,boxw2);
        boxw1.myBox.characteristics();
        boxw2.myBox.characteristics();

    }
}