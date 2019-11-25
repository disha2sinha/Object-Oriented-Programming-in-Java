class Multithread implements Runnable{
    long click=0;
    Thread t;
    private volatile boolean running =true;
    public Multithread(int p)
    {
        t=new Thread(this);
        t.setPriority(p);
        t.start();
    }
    public void run()
    {
        System.out.println("Thread Running:"+t);
        while(running)
        {
            if(click>10)
            {
                stop();
            }
            System.out.println(click++);
        }
    }
    public void stop()
    {
        running=false;
    }
}
/**
 * ThreeThread
 */
public class ThreeThread {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        Multithread th1=new Multithread(7);
        Multithread th2=new Multithread(5);
        Multithread th3=new Multithread(3);
        try{
            System.out.println("Sleeping main Thread");
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted:"+e);
        }
        th1.stop();
        th2.stop();
        th3.stop();
        try{
            th1.t.join();
            th2.t.join();
            th3.t.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted:"+e);
        }
        System.out.println("Thread1:"+th1.click);
        System.out.println("Thread2:"+th2.click);
        System.out.println("Thread3:"+th3.click);

    }
}