package sharedworks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock locks = new ReentrantLock();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        SharedResourceCustomLock sharedResources = new  SharedResourceCustomLock();
        System.out.println("Main thread started");
        Thread thread1 = new Thread(()->{
            System.out.println("thread 1 produce started");
            sharedResources.producer2(lock);
        });
        SharedResourceCustomLock sharedResources1 = new SharedResourceCustomLock();
        Thread thread2 = new Thread(()->{
            System.out.println("Thread 2 produce started");
            sharedResources1.producer2(lock);
        });


        SharedResourceCustomLock sharedResources2 = new SharedResourceCustomLock();
        Thread thread3 = new Thread(()->{
            System.out.println("Thread 2 produce started");
            sharedResources2.consumer2(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();


//        try {
//            System.out.println("main thread is wait for thread1 to finish");
//            thread1.join();
//        }catch (Exception e){
//
//        }

        System.out.println("Main thread ended");
    }
}
