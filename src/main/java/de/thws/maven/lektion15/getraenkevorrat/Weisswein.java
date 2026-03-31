package de.thws.maven.lektion15.getraenkevorrat;

public class Weisswein extends Wein{

    public Weisswein(String herkunft, String sorte, double alkoholgehalt, int jahrgang){
        super(herkunft, sorte, alkoholgehalt, jahrgang);
    }

    public String toString(){
        return super.toString();
    }
}
