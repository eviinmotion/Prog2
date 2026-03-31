package de.thws.maven.lektion15.getraenkevorrat;

public class Rotwein extends Wein {

    public Rotwein(String herkunft, String sorte, double alkoholgehalt, int jahrgang){
        super(herkunft, sorte, alkoholgehalt, jahrgang);
    }

    public String toString(){
        return super.toString();
    }
}
