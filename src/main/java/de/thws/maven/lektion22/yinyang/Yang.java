package de.thws.maven.lektion22.yinyang;

public class Yang extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Yang");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public class Main {
        public static void main(String[] args){
            Yang yang = new Yang();
            yang.start();

            while(true){
                System.out.println("Yin");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
