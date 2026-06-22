package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

public class Raetselspiel extends Artikel {
    boolean einmalSpielbar;

    public Raetselspiel(String bezeichnung, boolean einmalSpielbar, int preisInCents){
        super(bezeichnung, preisInCents);
        this.einmalSpielbar = einmalSpielbar;
    }

    public boolean getEinmalSpielbar(){
        return this.einmalSpielbar;
    }

}
