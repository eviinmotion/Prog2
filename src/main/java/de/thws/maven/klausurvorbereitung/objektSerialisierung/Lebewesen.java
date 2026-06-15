package de.thws.maven.klausurvorbereitung.objektSerialisierung;

import java.io.Serializable;

public abstract class Lebewesen implements Serializable {
    String name;

    public Lebewesen(String name){
        this.name = name;
    }

    public abstract String beschreibe();
}
