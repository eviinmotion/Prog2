package de.thws.maven.lektion18;
import java.io.*;
public class Studiengangsplitter {

    public void splitStudiengaenge(String dateiname) throws MatrikelNummerException, IOException{   //laut aufgabenstellung soll methode eine exception werfen
        try(
            BufferedReader reader = new BufferedReader(new FileReader(dateiname));  //einlesen
            PrintWriter winfwriter = new PrintWriter(new FileWriter("WInfNr.txt")); //jeweils schreiben
            PrintWriter infwriter = new PrintWriter(new FileWriter("InfNr.txt"));
            PrintWriter ecwriter = new PrintWriter(new FileWriter("ECNr.txt"));
        ){
            String zeile;
            while( (zeile = reader.readLine()) != null){
                if(zeile.trim().isEmpty()) continue;            //trim ignoriert die leerzeilen

                try{
                    int nr = Integer.parseInt(zeile.trim());            //nimm nummern ohne leerzeichen
                    if(nr >= 5000000 && nr <= 5099999){
                        winfwriter.println(nr);
                    }
                    if(nr >= 5100000 && nr <= 5199999){
                        infwriter.println(nr);
                    }
                    if(nr >= 6100000 && nr <= 6199999){
                        ecwriter.println(nr);
                    }else{
                        throw new MatrikelNummerException("Ungültige Matrikelnummer! "+nr);
                    }
                }catch(NumberFormatException e){
                    throw new MatrikelNummerException("Formatfehler in Datei "+zeile);
                }
            }
        }
    }
}
