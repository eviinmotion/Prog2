package de.thws.maven.klausurvorbereitung.streamOperationen;

import java.util.Date;

public class Manager extends Employee {
    int teamGroesse;
    String bereich;

    public Manager(String name, Date geburtsdatum, Date eintrittsdatum, String abteilung, double gehalt, Manager chef, int teamGroesse, String bereich){
        super(name, geburtsdatum, eintrittsdatum, abteilung, gehalt, chef);
        this.teamGroesse = teamGroesse;
        this.bereich = bereich;
    }
}
