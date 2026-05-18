package de.thws.maven.lektion20.kartenspiel;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Karte> hand = new ArrayList<>();
    private final static int kartenBeginn = 7;

    public void karteZiehen(Karte karte){
        hand.add(karte);
    }

    public void karteAusspielen(int index){
        hand.remove(index);
    }

    public List<Karte> getHand(){
        return hand;
    }

    public String toString(){
        return hand.toString();
    }

}
