package day39_Collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    /**
     * Thread: subset of a process
     * Multi threading in java comes from Thread class and Runnable interface
     * to execute all threads at the same time concurrently we need to use start() method.
     * -----------------------------------------------------------------------------------
     * Which one to choose?
     * If a custom class already extended another class than we need to use runnable INTERFACE
     * If the custom class is not going to extend any other class than we can use Thread CLASS
     */
    @Override
    public void run() {  // throws exception not allowing to be passes as method signature
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello Wold! " + i + " Thread: " + threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
