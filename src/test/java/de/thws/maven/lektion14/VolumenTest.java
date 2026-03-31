package de.thws.maven.lektion14;
import static de.thws.maven.lektion14.Kugelvolumen.berechneKugelvolumen;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class VolumenTest {
    @Test
    public void testVolumen() {
        assertEquals(4.0/3*Math.PI*1*1*1,berechneKugelvolumen(1));
        assertEquals(0,berechneKugelvolumen(0));
        assertEquals(4.0/3*Math.PI*5*5*5,berechneKugelvolumen(5));
        assertEquals(0,berechneKugelvolumen(-1));
    }
}
