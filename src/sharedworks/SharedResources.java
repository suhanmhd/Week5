package sharedworks;

public class SharedResources {
    boolean isAvailable = false;

    public synchronized  void produce() {
        System.out.println("acquire the lock  "+Thread.currentThread().getName());
        try {
            Thread.sleep(8000);
        }
        catch (Exception e) {

        }
        isAvailable = true;
        System.out.println("Lock released  "+ Thread.currentThread().getName());
    }
}
