package de.thws.maven.lektion22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlThread extends Thread{
    List<Integer> zahlZumTesten = new ArrayList<>();
    Map<Integer, Boolean> ergebnis = new HashMap<>();

    public PrimzahlThread(List<Integer> zahlZumTesten) {
        this.zahlZumTesten = zahlZumTesten;
    }

    public static boolean testeObPrimzahl(int zahl){
        if(zahl < 2) return false;
        for(int divisor = 2; divisor < zahl; divisor++){
            if(zahl % divisor == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for(int zahl : zahlZumTesten){
            boolean istPrimzahl = testeObPrimzahl(zahl);
            ergebnis.put(zahl, istPrimzahl);
        }
    }

    public Map<Integer, Boolean> getErgebnis(){
        return ergebnis;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list1 = new ArrayList<>(List.of(2,4,5,6,7,8,3,3434,354565786,453));
        List<Integer> list2 = new ArrayList<>(List.of(543534,543543512,678987654,323456));


        PrimzahlThread thread1 = new PrimzahlThread(list1);
        PrimzahlThread thread2 = new PrimzahlThread(list2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Map<Integer, Boolean> gesamtMap = new HashMap<>();
        gesamtMap.putAll(thread1.getErgebnis());
        gesamtMap.putAll(thread2.getErgebnis());

        for(Map.Entry<Integer, Boolean> eintrag : gesamtMap.entrySet()){
            System.out.println(eintrag.getKey() +" -> "+ eintrag.getValue());
        }

    }

}
