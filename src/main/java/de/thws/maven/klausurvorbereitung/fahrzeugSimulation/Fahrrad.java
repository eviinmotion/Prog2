package de.thws.maven.klausurvorbereitung.fahrzeugSimulation;

public class Fahrrad extends Fahrzeug{

    @Override
    public double tankstand(){
        return 0.0;
    }

    @Override
    public void fahre(){
        System.out.println(".....");
    }
}
