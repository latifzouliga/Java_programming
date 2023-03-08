package day39_Collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        /**
         * Keywords:
         *  - process
         *  - thread
         *  - multiThreading
         *  ---------------------------------------------------------------------------------
         *  when this file is executed, it is going to create a process
         *  this process is called an instance of java application
         *  this process has 5 threads that runs concurrently (at the same time)
         *  Multithreading is tw0 or more process that has more than one thread running concurrently
         */


        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        // all the threads will start at the same time

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
