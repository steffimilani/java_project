class MyThread extends Thread {

    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000); // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " Interrupted");
        }

        System.out.println(threadName + " Finished");
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        System.out.println("Starting Threads...");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("All Threads Completed.");
    }
}