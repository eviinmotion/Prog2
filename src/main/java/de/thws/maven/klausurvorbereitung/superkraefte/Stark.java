package de.thws.maven.klausurvorbereitung.superkraefte;

public interface Stark {

    default void hebeGewicht(int kg){
        System.out.println(kg+" werden gehoben");
    }
}
