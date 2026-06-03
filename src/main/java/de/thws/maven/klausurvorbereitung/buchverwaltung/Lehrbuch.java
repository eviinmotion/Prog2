package de.thws.maven.klausurvorbereitung.buchverwaltung;

public class Lehrbuch extends Buch{
    private String titel;
    private String autor;
    private String fachgebiet;

    public Lehrbuch(String titel, String autor, String fachgebiet){
        super(titel, autor);
        this.fachgebiet = fachgebiet;
    }

    @Override
    public String zeigeInfo(){
        return super.zeigeInfo() + fachgebiet;
    }

}
