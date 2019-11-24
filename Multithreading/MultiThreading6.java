package Multithreading;

class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String thdname)
    {
        name=thdname;
        t=new Thread(this,name);
        System.out.println("New Thread:"+t);
        t.start();
    }
    public void run()
    {
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println(name+":"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name+" exiting");
    }
}
/**
 * MultiThreading6
 */
class MultiThreading6 {
    public static void main(String[] args) {
        NewThread ob1=new NewThread("Thread One");
        NewThread ob2=new NewThread("Thread Two");
        NewThread ob3=new NewThread("Thread Three");
        System.out.println("Ob1 is Alive:"+ob1.t.isAlive());
        System.out.println("Ob2 is Alive:"+ob2.t.isAlive());
        System.out.println("Ob3 is Alive:"+ob3.t.isAlive());
        try
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupted");
            System.out.println("Ob1 is Alive:" + ob1.t.isAlive());
            System.out.println("Ob2 is Alive:" + ob2.t.isAlive());
            System.out.println("Ob3 is Alive:" + ob3.t.isAlive());
        }

    }

    
}