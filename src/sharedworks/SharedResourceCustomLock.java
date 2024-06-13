package sharedworks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceCustomLock {
    boolean isAvailable = false;

    public void produce(ReentrantLock locks ) {
        try {
            locks.lock();
            System.out.println("lock acquired by the thread "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);

        }catch (Exception e){

        }
        finally {
            locks.unlock();
            System.out.println("lock is released by the thread "+ Thread.currentThread().getName());
        }
    }

    public  void producer2(ReadWriteLock locks){
        try {
            locks.readLock().lock();
            System.out.println("lock acquired by the thread "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);

        }catch (Exception e){

        }
        finally {
            locks.readLock().unlock();
            System.out.println("lock is released by the thread "+ Thread.currentThread().getName());
        }
    }


    public  void consumer2(ReadWriteLock locks){
        try {
            locks.writeLock().lock();
            System.out.println("lock acquired by the thread "+ Thread.currentThread().getName());
            isAvailable = false;
//            Thread.sleep(8000);

        }catch (Exception e){

        }
        finally {
            locks.writeLock().unlock();
            System.out.println("lock is released by the thread "+ Thread.currentThread().getName());
        }
    }
}
