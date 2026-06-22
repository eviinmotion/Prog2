package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

public class Buch extends Artikel {
    int seitenanzahl;

    public Buch(String bezeichnung, int seitenanzahl, int preisInCents){
        super(bezeichnung, preisInCents);
        this.seitenanzahl = seitenanzahl;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public double preisProSeite(){
        return (double) preisInCents/seitenanzahl;
    }

}
