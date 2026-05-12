package de.thws.maven.lektion20.maumau;

public enum Suit {
    HERZ("♥"),
    KARO("♦"),
    KREUZ("♣"),
    PIK("♠");

    private final String symbol;

    Suit(String symbol){
        this.symbol = symbol;
    }
    public String getSuit(){
        return symbol;
    }
}
