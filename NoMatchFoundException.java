import java.io.*;
/**
 * NoMatchFoundException
 */

 @SuppressWarnings("serial")
class myException extends Exception{
    String s;
    myException(String s)
    {
        this.s=s;
    }
    public String toString()
    {
        return("My Exception["+s+"] not present");
    }
}
class NoMatchFoundException {
    static void check(String s,String city[])throws myException
    {
        int flag=0;
        for(int i=0;i<city.length;i++)
        {
            if(s.compareToIgnoreCase(city[i])==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            throw new myException(s);
        }
        else{
            System.out.println("Normal Exit");
        }
    }
    public static void main(String[] args)throws IOException {
        String city[];
        System.out.println("Number of cities:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        city=new String[n];
        System.out.println("Enter cities:");
        for(int i=0;i<n;i++)
        {
            city[i]=br.readLine();
        }
        try{
            check("Kolkata",city);

        }
        catch (myException e) {
            System.out.println("Caught"+e);
        }
    }
    
}