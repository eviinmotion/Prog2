package de.thws.maven.klausurvorbereitung.fahrzeugHierarchie;

public abstract class Fahrzeug {
    int geschwindigkeit;

    public abstract void beschleunige(int delta);

    public abstract int getGeschwindigkeit();

}
