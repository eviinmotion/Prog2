package de.thws.maven.lektion15.unternehmen;

public class Angestellter {
    protected String nachname;
    protected String vorname;
    protected double grundgehalt;
    protected int identifikator;
    protected String geburtsdatum;
    protected double gehaltsfaktor = 1.0;

    public Angestellter(String vorname, String nachname, double grundgehalt, int identifikator, String geburtsdatum){
        this.nachname = nachname;
        this.vorname = vorname;
        this.grundgehalt = grundgehalt;
        this.identifikator = identifikator;
        this.geburtsdatum = geburtsdatum;
    }
    public double getGehalt(){
        return grundgehalt * gehaltsfaktor;
    }
}
