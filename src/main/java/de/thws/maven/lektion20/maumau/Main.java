package de.thws.maven.lektion20.maumau;

import java.util.ArrayList;
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
        leon.get
    }
}
