package de.thws.maven.lektion20.maumau;

public class Karte implements Comparable<Karte>{
    private Rank rank;
    private Suit suit;

    public Karte(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return this.rank + suit.getSuit();
    }

    public int getRank(){
        return rank.getRank();
    }

    public String getSuit(){
        return suit.getSuit();
    }

    @Override
    public int compareTo(Karte andereKarte) {
        return Integer.compare(this.getRank(), andereKarte.getRank());
    }

    public boolean compareSymbol(Karte andereKarte){
        return this.getSuit().equals(andereKarte.getSuit());
    }
}
