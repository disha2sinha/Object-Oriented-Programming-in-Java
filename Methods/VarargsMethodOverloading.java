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
    
    /*void varargs(boolean...a) {
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
    }*/
    
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
        obj.varargs();/*int is more specific than double. If more than one member method is both accessible and applicable to a method invocation, it is necessary to choose one to provide the descriptor for the run-time method dispatch. The Java programming language uses the rule that the most specific method is chosen according to type promotion. The following rules define the direct supertype relation among the primitive types in this case:

    double > float
    float > long
    long > int
    int > char
    int > short
    short > byte*/


    }
    
}