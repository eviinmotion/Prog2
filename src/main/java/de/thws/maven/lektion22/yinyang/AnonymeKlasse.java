package de.thws.maven.lektion22.yinyang;

public class AnonymeKlasse {
    public static void main(String[] args) {
        Thread yang = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    System.out.println("Yang");
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread yin = new Thread(() -> {
            while(true){
                System.out.println("Yin");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        yang.start();
        yin.start();
    }
}
