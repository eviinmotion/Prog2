package de.thws.maven.klausurvorbereitung.buchverwaltung;

public class Roman extends Buch{
    private String titel;
    private String autor;
    private String genre;

    public Roman(String titel, String autor, String genre){
        super(titel, autor);
        this.genre = genre;
    }
    @Override
    public String zeigeInfo(){
        return super.zeigeInfo() + genre;
    }
}
