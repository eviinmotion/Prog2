package de.thws.maven.lektion15.getraenkevorrat;

public abstract class Getraenk {
    String herkunft;
    String sorte;
    double alkoholgehalt;

    public Getraenk(String herkunft, String sorte, double alkoholgehalt){
        this.herkunft = herkunft;
        this.sorte = sorte;
        this.alkoholgehalt = alkoholgehalt;
    }
    public String toString(){
        return "Herkunft: "+this.herkunft+"\n"+"Sorte: "+this.sorte+"\n"+"Alkoholgehalt: "+this.alkoholgehalt;
    }

    public String alkoholfrei(){
        if(this.alkoholgehalt != 0){
            return "alkoholfrei: nein";
        }
        return "alkoholfrei: ja";
    }
}
