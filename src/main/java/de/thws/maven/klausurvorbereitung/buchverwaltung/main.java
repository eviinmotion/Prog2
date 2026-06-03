package de.thws.maven.klausurvorbereitung.buchverwaltung;

public class main {
    public static void main(String[] args) {
        Buch[] regal = {new Roman("Gone with the wind", "abc", "romantik"),
                new Lehrbuch("ich quäle gerne studenten", "jeder professor", "mint")};

        for(Buch b : regal){
            System.out.println(b.zeigeInfo());
        }
    }
}
