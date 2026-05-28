package de.thws.maven.lektion22.yinyang;

public class YinYangThread extends Thread{
    private final String text;

    public YinYangThread(String text){
        this.text = text;
    }


    @Override
    public void run() {
        while(true){
            System.out.println(text);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public class Main {
        public static void main(String[] args){
            YinYangThread yin = new YinYangThread("Yin");
            YinYangThread yang = new YinYangThread("Yang");

            yin.start();
            yang.start();

        }
    }
}
