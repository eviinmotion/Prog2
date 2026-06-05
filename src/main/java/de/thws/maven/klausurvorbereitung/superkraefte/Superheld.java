package de.thws.maven.klausurvorbereitung.superkraefte;

import java.util.List;

public class Superheld implements Flugfaehig, Stark, Unsichtbar {
    public static void main(String[] args) {
        List<Superheld> superhelden = List.of(new Superheld(), new Superheld(), new Superheld(), new Superheld(), new Superheld());

        for(Superheld superheld : superhelden){
            int zahl = (int)(Math.random()*4)-1;
            if(zahl == 0){
                superheld.versteckeDich();
            }
            if(zahl == 1){
                superheld.hebeGewicht(50);
            }
            if(zahl == 2){
                superheld.fliege();
            }
        }
    }
}
