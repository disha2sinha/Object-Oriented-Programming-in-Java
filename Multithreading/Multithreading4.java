package Multithreading;

import java.util.Random;

/**
 * Multithreading4
 */
class PrintTask extends Thread {
    

    public void run()
    {
        Random generator=new Random();

        int sleeptime=generator.nextInt(5000);

        try {
            System.out.printf("%s is going to sleep for %d milliseconds\n",Thread.currentThread().getName(),sleeptime);
            Thread.sleep(sleeptime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" state after .sleep is called:"+Thread.currentThread().getState());

        System.out.println(Thread.currentThread().getName()+" done sleeping");
    }
}
/**
 * Multithreading4
 */
public class Multithreading4 {

    public static void main(String[] args) {
        PrintTask t1=new PrintTask();
        System.out.println("State of "+t1.getName()+" after creating it:"+t1.getState());

        PrintTask t2=new PrintTask();
        System.out.println("State of "+t2.getName()+" after creating it:"+t2.getState());

        PrintTask t3=new PrintTask();
        System.out.println("State of "+t3.getName()+" after creating it:"+t3.getState());

        t1.start();
        System.out.println("State of " + t1.getName() + " after .start is called :" + t1.getState());
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t1.join();
            System.out.println(t1.getName()+" After .join is called "+t1.getState());
        }

        catch (Exception ex) {
            System.out.println("Exception has " + "been caught" + ex);
        }
        t2.start();
        System.out.println("State of " + t2.getName() + " after .start is called :" + t2.getState());
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
            System.out.println(t2.getName() + " After .join is called " + t2.getState());
        }

        catch (Exception ex) {
            System.out.println("Exception has " + "been caught" + ex);
        }
        t3.start();
        System.out.println("State of " + t3.getName() + " after .start is called :" + t3.getState());

    }
}