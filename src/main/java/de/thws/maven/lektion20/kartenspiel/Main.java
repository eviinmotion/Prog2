package de.thws.maven.lektion20.kartenspiel;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[]args){
        MauMau spiel = new MauMau();

        Spieler eve = new Spieler("Eve");

        spiel.austeilen(eve.getHand());

        System.out.println("Eve hat folgendes auf der Hand: " + eve.getHand());


        Skat skat = new Skat();
        Spieler leon = new Spieler("Leon");

        skat.austeilen(leon.getHand());

        List<Karte> leonHand = leon.getHand().getHand();

        Collections.sort(leonHand);
        Collections.reverse(leonHand);
        System.out.println("Leon hat folgendes der Hand: " + leonHand);
    }
}
