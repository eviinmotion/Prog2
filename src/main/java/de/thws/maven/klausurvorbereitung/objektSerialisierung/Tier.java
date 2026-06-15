package de.thws.maven.klausurvorbereitung.objektSerialisierung;

import java.io.Serializable;

public class Tier extends Lebewesen {
    private String art;

    public Tier(String name, String art){
        super(name);
        this.art = art;
    }

    public String beschreibe(){
        return this.name + " ist ein "+ this.art;
    }
}
