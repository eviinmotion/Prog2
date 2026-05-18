package de.thws.maven.lektion20.sms;

public enum Legende {
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;

    public int getZahl(){
        return switch(this){
            case A,B,C -> 2;
            case D,E,F -> 3;
            case G,H,I -> 4;
            case J,K,L -> 5;
            case M,N,O -> 6;
            case P,Q,R,S -> 7;
            case T,U,V -> 8;
            case W,X,Y,Z -> 9;
            default -> 0;
        };
    }
    public Legende getBuchstabe(){
        return this;
    }
}
