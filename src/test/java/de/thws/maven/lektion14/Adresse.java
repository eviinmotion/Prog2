package de.thws.maven.lektion14;

public class Adresse {
    private String ort;
    private String strasse;
    private String hausnummer;

    public Adresse(String ort, String strasse, String hausnummer){
        boolean GBstrasse = false;
        boolean GBort = false;
        boolean ziffer = false;
        if(strasse.charAt(0) >= 'A' && strasse.charAt(0) <= 'Z'){
            this.strasse = strasse;
            GBstrasse = true;
        }
        if(ort.charAt(0) >= 'A' && ort.charAt(0) <= 'Z'){
            this.ort = ort;
            GBort = true;
        }
        if(hausnummer.charAt(0) >= '1' && hausnummer.charAt(0) <= '9'){
            this.hausnummer = hausnummer;
            ziffer = true;
        }
        if(!GBstrasse || !GBort ||!ziffer){
            throw new RuntimeException("muss mit GB beginnen");
        }
    }
}
