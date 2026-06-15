package de.thws.maven.klausurvorbereitung.collections;

public class Buch implements Comparable<Buch>{
    private String titel;
    private int seiten;

    public Buch(String titel, int seiten) {
        this.titel = titel;
        this.seiten = seiten;
    }

    public int getSeiten(){
        return seiten;
    }

    public String getTitel(){
        return titel;
    }

    public int compareTo(Buch other){
        int vergleich =  Integer.compare(other.seiten, seiten);

        if(vergleich != 0){
            return vergleich;
        }
        return titel.compareTo(other.titel);
    }

    @Override
    public String toString() {
        return titel + " " + seiten;
    }
}
