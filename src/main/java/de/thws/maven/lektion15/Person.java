package de.thws.maven.lektion15;

abstract class Person {
    String fach;

    public Person(String fach){
        this.fach = fach;
    }

    public abstract void gibTaetigkeitAus();

}
