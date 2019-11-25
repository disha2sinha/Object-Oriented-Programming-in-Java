import java.io.*;

@SuppressWarnings("serial")
class myException extends Exception{
    public String toString()
    {
        return("DivideByZero Exception");
    }
}
/**
 * DivideByZero
 */
class DivideByZero {
    static float compute(float n,float b)throws myException{
        if (b==0)
        {
            throw new myException();
        }
        else
        {
            return (n/b);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers:");
        float a=Float.parseFloat(br.readLine());
        float b=Float.parseFloat(br.readLine());
        float q=-1;
        try{
            q=compute(a, b);
        }
        catch(myException e)
        {
            System.out.println(e);
        }
        finally{
            if(q==-1)
            {
                System.out.println("Error Ocurred");
            }
            else{
                System.out.println(q);
            }
        }
        
    }
}