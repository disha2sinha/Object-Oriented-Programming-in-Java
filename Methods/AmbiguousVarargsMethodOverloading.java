class Test
{
    void varargs(int...a)
    {
        System.out.println("METHOD:varargs(int...)\tNUMBER OF ARGUMENTS:"+a.length+"\tITEMS:");
        for(int i:a)
        {
            System.out.println(i+" ");
        }
    }
    
    void varargs(boolean...a) {
        System.out.println("METHOD:varargs(boolean...)\tNUMBER OF ARGUMENTS:" + a.length + "\tITEMS:");
        for(boolean i:a)
        {
            System.out.println(i+" ");
        }
    }
    
    void varargs(String... a) {
        System.out.println("METHOD:varargs(String...)\tNUMBER OF ARGUMENTS:" + a.length + "\tITEMS:");
        for (String i:a)
        {
            System.out.println(i+" ");
        }
    }
    
    void varargs(float... a) {
        System.out.println("METHOD:varargs(float...)\tNUMBER OF ARGUMENTS:" + a.length + "\tITEMS:");
        for(float i:a)
        {
            System.out.println(i+" ");
        }
    }
    
    void varargs(String msg,int... a) {
        System.out.println("METHOD:varargs(String,int...)\tNUMBER OF ARGUMENTS:" + a.length + "\tITEMS:"+msg +"\t");
        for(int i:a)
        {
            System.out.println(i+" ");
        }
    }
}
class VarargsMethodOverloading {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.varargs("Hello World",10,30,80,90);
        obj.varargs(10.9f,8.0f);
        //obj.varargs(true,false);
        //obj.varargs("Disha","Argha","World");
        obj.varargs();//ambiguous
        obj.varargs("A");//ambiguous.Compiler cannot resolve between  varargs(String...) and varargs(String,int...)
    }
}