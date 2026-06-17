package de.thws.maven.klausurvorbereitung.thread;

import java.util.List;

public class Zahlenliste implements Runnable{
    private List<Integer> zahlenListe;
    private int ergebnis = 0;

    public Zahlenliste(List<Integer> zahlenListe){
        this.zahlenListe = zahlenListe;
    }

    public void run(){
        for(int zahlen : zahlenListe){
            ergebnis += zahlen;
        }
        System.out.println(ergebnis);
    }

    public static void main(String[] args) {
        List<Integer> zahlenliste = List.of(5,2,3,4,5,2,32,1,1,2,34,5,7);

        Zahlenliste runnable = new Zahlenliste(zahlenliste);
        Thread thread = new Thread(runnable);
        thread.start();

        try{
            thread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
