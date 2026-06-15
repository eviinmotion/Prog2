package de.thws.maven.klausurvorbereitung.objektSerialisierung;

import java.io.Serializable;

public class Mensch extends Lebewesen {
    private String beruf;

    public Mensch(String name, String beruf) {
        super(name);
        this.beruf = beruf;
    }

    public String beschreibe(){
        return this.name + " arbeitet als "+ this.beruf;
    }
}
