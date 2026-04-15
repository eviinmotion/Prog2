package de.thws.maven.lektion16.muenzautomat;

public class NewChangeCalculator implements ChangeCalculator{

    public int[] getChange(int euros, int cent){
        int gesamtSumme = (euros*100)+cent;
        int[] ergebnis = new int[8];
        int[] staffelung = {1, 2, 5, 10, 20, 50, 100, 200}; //von 1 anfangen da forschleife rückwärts läuft
        for(int i = 7; i >=0; i--){
            ergebnis[i] = gesamtSumme/staffelung[i];
            gesamtSumme = gesamtSumme%staffelung[i];
        }
        return ergebnis;
    }
}
