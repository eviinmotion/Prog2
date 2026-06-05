package de.thws.maven.klausurvorbereitung.fahrzeugHierarchie;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Fahrzeug[] fahrzeuge = {new Fahrrad(), new Auto()};

        for(Fahrzeug f : fahrzeuge){
            f.beschleunige(50);
            f.beschleunige(300);
            f.beschleunige(20);
        }
    }
}
