package de.thws.maven.klausurvorbereitung.fahrzeugSimulation;

public class Auto extends Fahrzeug{
    private double tankstand = 60.0;

    @Override
    public void fahre(){
        System.out.println("brrrrrum");
    }

    @Override
    public double tankstand(){
        return tankstand;
    }
}
