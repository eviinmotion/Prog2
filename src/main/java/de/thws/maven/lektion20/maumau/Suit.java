package de.thws.maven.lektion20.maumau;

public enum Suit {
    KREUZ("♣"),
    PIK("♠"),
    HERZ("♥"),
    KARO("♦");


    private final String symbol;

    Suit(String symbol){
        this.symbol = symbol;
    }
    public String getSuit(){
        return symbol;
    }
}
