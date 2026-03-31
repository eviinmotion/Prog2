package de.thws.maven.lektion15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import de.thws.maven.lektion15.getraenkevorrat.*;
public class GetraenkeTest {
    @Test
    void getraenkeTest(){
        Getraenk bier = new Bier("Eichhofen","Helles",5.0);
        String expected = """
                    Herkunft: Eichhofen
                    Sorte: Helles
                    Alkoholgehalt: 5.0""";

        assertEquals(expected, bier.toString());

    }
}
