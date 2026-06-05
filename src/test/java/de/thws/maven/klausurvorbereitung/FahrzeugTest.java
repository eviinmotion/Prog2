package de.thws.maven.klausurvorbereitung;

import org.junit.jupiter.api.Test;
import de.thws.maven.klausurvorbereitung.fahrzeugHierarchie.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FahrzeugTest {

    @Test
    public void testGeschwindigkeit50Auto(){
        Fahrzeug[] auto = {new Auto()};
        auto[0].beschleunige(50);
        assertEquals(50, auto[0].getGeschwindigkeit());
    }
    @Test
    public void testGeschwindigkeit50Fahrrad(){
        Fahrzeug[] fahrrad = {new Fahrrad()};
        fahrrad[0].beschleunige(50);
        assertEquals(40, fahrrad[0].getGeschwindigkeit());
    }
    @Test
    public void testGeschwindigkeit250Auto(){
        Fahrzeug[] auto = {new Auto()};
        auto[0].beschleunige(250);
        assertEquals(200, auto[0].getGeschwindigkeit());
    }
    @Test
    public void testGeschwindigkeit25Fahrrad(){
        Fahrzeug[] fahrrad = {new Fahrrad()};
        fahrrad[0].beschleunige(25);
        assertEquals(25, fahrrad[0].getGeschwindigkeit());
    }
}
