package de.thws.maven.lektion20.maumau;

public enum Rank {
    ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9),
    ZEHN(10), BUBE(11), DAME(12), KOENIG(13), ASS(14);

    private final int rank;

    Rank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return rank;
    }
}
