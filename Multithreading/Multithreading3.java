package Multithreading;

/**
 * Multithreading2
 */
class DemoThread implements Runnable {
    Thread t;
    DemoThread() {
        t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 8; i > 0; i--) {
                System.out.println("Child:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Exiting");
    }

}

class Multithreading3 {
    public static void main(String[] args) {
        new DemoThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Main Exiting");
    }

}