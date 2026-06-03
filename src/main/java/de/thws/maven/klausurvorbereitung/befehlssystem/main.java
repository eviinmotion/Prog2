package de.thws.maven.klausurvorbereitung.befehlssystem;

public class main {
    public static void main(String[] args){

        for(Befehl b : Befehl.values()){
            b.ausfuehren();
        }
    }
}
