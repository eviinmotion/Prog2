package de.thws.maven.klausurvorbereitung.objektSerialisierung;

import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        ArrayList<Lebewesen> liste = new ArrayList<>();

        liste.add(new Mensch("Karl", "Schreiner"));
        liste.add(new Tier("Baku", "Hund"));
        liste.add(new Mensch("Lele", "Investmentbanker"));
        liste.add(new Mensch("Se", "Studentin"));
        liste.add(new Mensch("Ev","Studentin"));
        liste.add(new Tier("Rafael","Giraffe"));
        liste.add(new Tier("Professor McGonagal","Katze"));

        File datei = new File("datei.txt");

        try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(datei))){
            out.writeObject(liste);
        }catch(IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(datei))){
            ArrayList<Lebewesen> readList = (ArrayList<Lebewesen>) input.readObject();

            for(Lebewesen l : readList){
                System.out.println(l.beschreibe());
            }

            }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }




    }
}
