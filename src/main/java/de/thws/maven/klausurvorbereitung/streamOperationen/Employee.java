package de.thws.maven.klausurvorbereitung.streamOperationen;

import java.util.Date;

public class Employee {
    String name;
    Date geburtsdatum, eintrittsdatum;
    String abteilung;
    double gehalt;
    Manager chef;

    public Employee(String name, Date geburtsdatum, Date eintrittsdatum, String abteilung, double gehalt, Manager chef) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
        this.chef = chef;
        this.eintrittsdatum = eintrittsdatum;
    }
}
