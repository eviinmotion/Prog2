package de.thws.maven.klausurvorbereitung.interfaces;

public class Computer implements Bedienbar{
    private boolean an = false;
    private int counter = 0;

    @Override
    public void einschalten(){
        System.out.println("Computer eingeschaltet!");
        an = true;
        counter++;
    }

    @Override
    public void ausschalten(){
        System.out.println("Computer ausgeschaltet!");
        an = false;
    }

}
