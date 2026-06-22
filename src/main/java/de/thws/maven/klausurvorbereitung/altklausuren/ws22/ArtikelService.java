package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

import java.util.ArrayList;
import java.util.List;

public class ArtikelService {
    public static List<Artikel> filterEinmalSpielbar(List<Artikel> artikelListe){
        List<Artikel> result = new ArrayList<>();
        for(Artikel a : artikelListe){
            if(a instanceof Raetselspiel){
                Raetselspiel spiel = (Raetselspiel) a;
                if(spiel.getEinmalSpielbar()){
                    result.add(a);
                }
            }
            if(a instanceof Raetselbuch){
                Raetselbuch buch = (Raetselbuch) a;
                if(buch.getEinmalSpielbar()){
                    result.add(a);
                }
            }
        }
        return result;
    }
}
