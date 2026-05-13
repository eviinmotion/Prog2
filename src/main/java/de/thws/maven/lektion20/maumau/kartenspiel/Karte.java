package de.thws.maven.lektion20.maumau.kartenspiel;

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
        int rankVergleich = Integer.compare(this.getRank(), andereKarte.getRank());
        if(rankVergleich != 0){
            return rankVergleich;
        }
        return this.getSuit().compareTo(andereKarte.getSuit());
    }
}
