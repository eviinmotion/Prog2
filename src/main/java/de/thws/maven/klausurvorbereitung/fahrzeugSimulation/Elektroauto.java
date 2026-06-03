package de.thws.maven.klausurvorbereitung.fahrzeugSimulation;

public class Elektroauto extends Fahrzeug{
    private double tankstand = 80.0;

    @Override
    public double tankstand(){
        return tankstand;
    }

    @Override
    public void fahre(){
        System.out.println("zzzzzzzz");
    }
}
