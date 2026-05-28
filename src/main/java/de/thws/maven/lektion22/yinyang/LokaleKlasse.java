package de.thws.maven.lektion22.yinyang;

public class LokaleKlasse {
    public static void main(String[] args) {
        class YinYangThread extends Thread {
            private final String text;

            public YinYangThread(String text){
                this.text = text;
            }

            @Override
            public void run(){
                while(true){
                    System.out.println(text);
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }

        YinYangThread yang = new YinYangThread("yang");
        YinYangThread yin = new YinYangThread("yin");

        yang.start();
        yin.start();
    }
}
