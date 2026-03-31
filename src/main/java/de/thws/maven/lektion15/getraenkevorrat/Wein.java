package de.thws.maven.lektion15.getraenkevorrat;

public abstract class Wein extends Getraenk {
    int jahrgang;

    public Wein(String herkunft, String sorte, double alkoholgehalt, int jahrgang){
        super(herkunft, sorte, alkoholgehalt);
        this.jahrgang = jahrgang;
    }
    public String toString(){
        String out = super.toString();
        return out+"\n"+"Jahrgang: "+this.jahrgang;
    }

}
