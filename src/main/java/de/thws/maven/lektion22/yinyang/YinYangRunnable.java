package de.thws.maven.lektion22.yinyang;

public class YinYangRunnable implements Runnable{
    private final String text;

    public YinYangRunnable(String text){
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
            Thread yin = new Thread(new YinYangRunnable("yin"));
            Thread yang = new Thread(new YinYangRunnable("yang"));

            yin.start();
            yang.start();

        }
    }
}
