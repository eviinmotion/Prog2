package de.thws.maven.lektion15.unternehmen;

public class Abteilungsleiter extends Angestellter {

    public Abteilungsleiter(String vorname, String nachname, double grundgehalt, int identifikator, String geburtsdatum){
        super(vorname, nachname, grundgehalt, identifikator, geburtsdatum);
        this.gehaltsfaktor = 2.0;
    }

    public void befoerdern(Angestellter angestellter){
        angestellter.gehaltsfaktor *= 1.1;
    }
}
