package pe.demo;

import pe.demo.thread.MyRunnable;
import pe.demo.thread.MyThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        /*MyThread myThread  = new MyThread();*/
        MyRunnable myRunnable = new MyRunnable();

        /*myThread.start();*/
       int poolsize = 10;
       int cont = 0;

        while (true){
            Thread myThread1 = new Thread(myRunnable);
            cont++;
            System.out.println("Threads : number > "+cont);
            myThread1.start();
            if (cont==poolsize){
                try {
                    myThread1.join();
                    System.out.println("Finished block treads of 10 > "+cont);
                } catch (InterruptedException e) {

                }
                cont= 0;
            }
        }
    }
}
