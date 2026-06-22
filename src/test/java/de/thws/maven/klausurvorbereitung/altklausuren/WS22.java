package de.thws.maven.klausurvorbereitung.altklausuren;

import de.thws.maven.klausurvorbereitung.altklausuren.ws22.Artikel;
import de.thws.maven.klausurvorbereitung.altklausuren.ws22.ArtikelService;
import de.thws.maven.klausurvorbereitung.altklausuren.ws22.Raetselbuch;
import de.thws.maven.klausurvorbereitung.altklausuren.ws22.Raetselspiel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WS22 {


    @Test
    public void testFilterEinmalSpielbar(){
        ArtikelService service = new ArtikelService();

        // 2. Eingabeliste mit 3 Artikeln befüllen (Reihenfolge: Name, Preis, Gewicht, [Seiten], einmalSpielbar)
        List<Artikel> eingabeListe = new ArrayList<>();
        eingabeListe.add(new Raetselbuch("Gone with the wind", 999, false, 500)); // nicht spielbar
        eingabeListe.add(new Raetselspiel("Sudoku", true, 100));                  // spielbar!
        eingabeListe.add(new Raetselbuch("Best of Sudoku", 100, true, 1299));     // spielbar!

        // 3. Methode ausführen und das Ergebnis AUFFANGEN
        List<Artikel> tatsaechlichesResultat = service.filterEinmalSpielbar(eingabeListe);

        // 4. Erwartete Ergebnis-Liste manuell aufbauen
        List<Artikel> erwartetesResultat = new ArrayList<>();
        // Wichtig: Hier müssen exakt dieselben Objekte rein, die auch in der Eingabe waren
        erwartetesResultat.add(eingabeListe.get(1)); // Fügt das Sudoku-Spiel hinzu
        erwartetesResultat.add(eingabeListe.get(2)); // Fügt das Best of Sudoku-Buch hinzu

        // 5. Assert: assertEquals vergleicht bei Listen die Inhalte und die Reihenfolge
        assertEquals(erwartetesResultat, tatsaechlichesResultat);

        // Optionaler Zusatz-Check für die Klausur: Stimmt die Größe?
        assertEquals(2, tatsaechlichesResultat.size());
    }
}
