package pe.demo.thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Processing thread");
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}