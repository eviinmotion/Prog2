package de.thws.maven.lektion18;

import java.io.IOException;

public class mainMethode {
    public static void main(String[] args) {
        Studiengangsplitter splitter = new Studiengangsplitter();

        try{
            splitter.splitStudiengaenge("MatrNr.txt");
            System.out.println("Datei aufgeteilt");
        }catch(MatrikelNummerException e) {
            System.err.println(e.getMessage());
        }catch(IOException e){
            System.err.println("Datei nicht gefunden");
        }
    }
}
