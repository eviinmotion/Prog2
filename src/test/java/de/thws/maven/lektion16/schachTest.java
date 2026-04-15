package de.thws.maven.lektion16;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import de.thws.maven.lektion16.schach.Brett;
import de.thws.maven.lektion16.schach.LaeuferImpl;

public class schachTest {
    @Test
    public void testKombiniere() {
        Brett brett1 = new Brett();
        brett1.markiereFeld(3,5);

        Brett brett2 = new Brett();
        brett2.markiereFeld(6,2);

        Brett ergebnis = brett1.kombiniere(brett2);

        assertTrue(ergebnis.gibFeld(3,5));
        assertTrue(ergebnis.gibFeld(6,2));
        assertFalse(ergebnis.gibFeld(1,1));
    }
}
