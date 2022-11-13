package threads;

public class Kostur implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("kostur calisiyoru");
    }
}
