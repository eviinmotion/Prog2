package de.thws.maven.lektion15.unternehmen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnternehmenTest {
    @Test
    public void testBefördern(){
        Abteilungsleiter peter = new Abteilungsleiter("Peter","Schmitt", 2000, 12345, "01.01.1970");
        Angestellter moritz = new Angestellter("moritz", "braun", 1000, 234345, "01.01.2007");
        peter.befoerdern(moritz);
        assertEquals(1.1, moritz.gehaltsfaktor);
        peter.befoerdern(moritz);
        assertEquals(1.21, moritz.gehaltsfaktor, 0.0001);
    }
}
