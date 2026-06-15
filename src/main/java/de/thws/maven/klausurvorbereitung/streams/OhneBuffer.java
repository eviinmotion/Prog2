package de.thws.maven.klausurvorbereitung.streams;

import java.io.*;

public class OhneBuffer {
    public static void main(String[] args) {
        try(
                InputStream in = new FileInputStream("quelle.dat");
                OutputStream out = new FileOutputStream("ziel.dat")
                ){
            int b;
            while((b = in.read()) != -1){
                out.write(b);
            }
        }catch(FileNotFoundException e){
            System.err.println("Datei nicht gefunden!"+e.getMessage());
        }catch(IOException e){
            System.err.println("Allgemeiner Fehler ist aufgetreten."+e.getMessage());
        }

    }
}
