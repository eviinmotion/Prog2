package de.thws.maven.klausurvorbereitung.streamOperationen;

import java.util.Date;

public class Praktikant extends Employee {
    Date praktikumsende;
    String universitaet;

    public Praktikant(String name, Date geburtsdatum, Date eintrittsdatum, String abteilung, double gehalt, Manager chef, Date praktikumsende, String universitaet) {
        super(name, geburtsdatum, eintrittsdatum, abteilung, gehalt, chef);
        this.praktikumsende = praktikumsende;
        this.universitaet = universitaet;
    }
}
