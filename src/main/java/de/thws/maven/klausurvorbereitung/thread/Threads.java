package de.thws.maven.klausurvorbereitung.thread;

import java.io.IOException;

public class Threads {

    static class MeinThread extends Thread {
        public void run(){
            countdown();
        }
    }

    static class MeinRunnable implements Runnable{
        public void run(){
            countdown();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new MeinThread();
        Thread t2 = new Thread(new MeinRunnable());
        Thread t3 = new Thread(){
            public void run(){
                countdown();
            }
        };
        Thread t4 = new Thread(() -> countdown());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }

    public static void countdown(){
        try{
            for(int i = 5; i >= 0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
