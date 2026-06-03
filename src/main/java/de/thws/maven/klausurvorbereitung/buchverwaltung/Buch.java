package de.thws.maven.klausurvorbereitung.buchverwaltung;

public abstract class Buch {
    String titel;
    String autor;

    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
    }

    public String zeigeInfo(){
        return titel + autor;
    }
}
