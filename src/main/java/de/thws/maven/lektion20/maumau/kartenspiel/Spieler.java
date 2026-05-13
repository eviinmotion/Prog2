package de.thws.maven.lektion20.maumau.kartenspiel;

public class Spieler {
    private String name;
    private Hand hand;

    public Spieler(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public String getName(){
        return name;
    }
    public Hand getHand(){
        return hand;
    }

}
