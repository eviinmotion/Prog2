package de.thws.maven.klausurvorbereitung.interfaces;

public class Lampe implements Bedienbar {
    private boolean an = false;

    @Override
    public void einschalten(){
        System.out.println("Lampe eingeschaltet!");
        an = true;
    }

    @Override
    public void ausschalten(){
        System.out.println("Lampe ausschaltet!");
        an = false;
    }

}
