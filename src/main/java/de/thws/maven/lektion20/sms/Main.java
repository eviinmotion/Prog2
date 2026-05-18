package de.thws.maven.lektion20.sms;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File eingabe = new File("Zeichenkontakte.txt");
        File ausgabe = new File("Nummernkontakte.txt");

        SMS sms = new SMS();

        try{
            System.out.println("Starte Umwandlung ...");
            sms.smsUmwandeln(eingabe,ausgabe);

            System.out.println("Fertig!");
        }catch(IOException e) {
            System.err.println("Datei Fehler aufgetreten! " + e.getMessage());
        }
    }
}
