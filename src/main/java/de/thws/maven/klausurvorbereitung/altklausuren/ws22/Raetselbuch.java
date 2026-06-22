package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

public class Raetselbuch extends Buch{
    private boolean einmalSpielbar;

    public Raetselbuch(String bezeichnung, int seitenanzahl, boolean einmalSpielbar, int preisInCents) {
        super(bezeichnung, seitenanzahl, preisInCents);
        this.einmalSpielbar = einmalSpielbar;
    }

    public boolean getEinmalSpielbar(){
        return this.einmalSpielbar;
    }

}
