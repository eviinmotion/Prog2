package de.thws.maven.klausurvorbereitung.superkraefte;

public interface Flugfaehig {
    default void fliege(){
        System.out.println("fliegt");
    }
}
