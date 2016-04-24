package api.concurrency;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mariusz.lewandowski on 2016-03-29.
 */
public class ThreadTest {

    public   static int  c;


    @Before
    public void setUp(){

        c=0;
    }
    @Test
    public void joinTest() {

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        System.out.println("starting mt1");
        mt1.start();
        try {
            mt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("starting mt2");
        mt2.start();
        try {
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end main");

    }

    @Test
    public void interruptTest() {

        InterruptedThread mt1 = new InterruptedThread("interuptedThread");

        mt1.start();
        try {
            mt1.join(1000);
            System.out.println(mt1.isAlive());
            if (mt1.isAlive()) {
                mt1.interrupt();
            }

        } catch (InterruptedException e) {
            System.out.println("iterupted " + Thread.currentThread().getName());

            e.printStackTrace();
        }

        System.out.println("end main");

    }

    @Test
    public void syncMethodTest() {

        SyncThread st1 = new SyncThread();
        SyncThread st2 = new SyncThread();

        st1.start();
        st2.start();

        try {
            st1.join();
            st2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(st1.getValue());
//        System.out.println(st2.getValue());


    }

    @Test
    public void threadsStatesTest() {

        MyThread mt1 = new MyThread();

        assertTrue(Thread.State.NEW.compareTo(mt1.getState()) == 0);

        mt1.start();
        assertTrue(Thread.State.RUNNABLE.compareTo(mt1.getState()) == 0);

        try {
            mt1.join();
            assertTrue(Thread.State.TERMINATED.compareTo(mt1.getState()) == 0);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    class MyThread extends Thread {

        @Override
        public void run() {

            System.out.println("running mythread " + getName());
            super.run();
        }
    }

    class InterruptedThread extends Thread {

        public InterruptedThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                System.out.println("running " + getName());
                sleep(4000);
            } catch (InterruptedException e) {
                System.out.println("interupted " + getName());
                e.printStackTrace();
            }
        }
    }

    class SyncThread extends Thread {


        @Override
        public void run() {
            syncedMeth();
            syncedMeth();
        }

        public synchronized void syncedMeth() {

            try {
                Thread.currentThread().sleep(100);
                    c++;

                    System.out.println(getName() + " " + c);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        public synchronized int getValue(){
//            return c;
//        }


    }

}
