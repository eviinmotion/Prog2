package de.thws.maven.lektion14;

public class Person {
    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse){
        if(vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z'){
            this.vorname = vorname;
        }else{
            throw new RuntimeException("muss mit GB beginnen");
        }
        this.nachname= nachname;
    }
}
