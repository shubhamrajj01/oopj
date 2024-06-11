// Write a program in java which will display the working of two threads. 

public class Lab11_2 {
    public static void main(String[] args) {
        // Create the shared object
        SharedObject sharedObject = new SharedObject();

        // Create and start the first thread
        Thread thread1 = new Thread(new MyRunnable(sharedObject, "Thread 1"));
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new MyRunnable(sharedObject, "Thread 2"));
        thread2.start();
    }
}

class SharedObject {
    // A synchronized method to be accessed by multiple threads
    public synchronized void display(String threadName, int count) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadName + ": " + count + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
    }
}

class MyRunnable implements Runnable {
    private SharedObject sharedObject;
    private String threadName;

    public MyRunnable(SharedObject sharedObject, String threadName) {
        this.sharedObject = sharedObject;
        this.threadName = threadName;
    }

    public void run() {
        // Synchronize on the shared object to ensure thread safety
        synchronized (sharedObject) {
            sharedObject.display(threadName, 1);
            sharedObject.display(threadName, 2);
            sharedObject.display(threadName, 3);
            sharedObject.display(threadName, 4);
            sharedObject.display(threadName, 5);
        }
    }
}