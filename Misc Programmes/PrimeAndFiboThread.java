import java.io.*;
class fibonacci extends Thread{
    int a=0,b=1,n;
    fibonacci(int n){
        super("FIBONACCI THREAD");
        System.out.println("Fibonacci Thread in control");
        this.n=n;
        start();
    }
    public void run()
    {
        try{
            for(int i=1;i<=n;i++)
            {
                int temp=a+b;
                System.out.println("Fibonacci term:"+temp);
                a=b;
                b=temp;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName() + "interrupted");
        }
        System.out.println("Exiting"+ Thread.currentThread().getName());
    }
}

class prime extends Thread {
    int n;

    prime(int n) {
        super("PRIME THREAD");
        System.out.println("Prime Thread in control");
        this.n = n;
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <=n; i++) {
                int flag=0;
                for(int j=2;j<n;j++){
                    if (i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    System.out.println("prime term:" + i);
                    
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "interrupted");
        }
        System.out.println("Exiting" + Thread.currentThread().getName());
    }
}
/**
 * PrimeAndFiboThread
 */
class PrimeAndFiboThread {
    public static void main(String[] args) throws IOException{
        Thread.currentThread().setPriority(10);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of terms:");
        int n=Integer.parseInt(br.readLine());
        fibonacci f=new fibonacci(n);
        prime p=new prime(n);
        try {
            f.join();
            p.join();
        } catch (Exception e) {
            System.out.println("Exception Caught"+e);
        }
    }
    
}
