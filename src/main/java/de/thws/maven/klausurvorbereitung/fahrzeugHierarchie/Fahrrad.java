package de.thws.maven.klausurvorbereitung.fahrzeugHierarchie;

public class Fahrrad extends Fahrzeug{
    private int geschwindigkeit = 40;

    public void beschleunige(int delta){
        if(delta > geschwindigkeit || delta < 0){
            System.out.println("Tacho überschritten!");
            return;
        }
        geschwindigkeit = delta;
        System.out.println("Neue Geschwindigkeit: "+geschwindigkeit);
    }
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }
}
