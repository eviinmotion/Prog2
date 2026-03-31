package de.thws.maven.lektion14.Punkt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Punkttest {
    Punkt p = new Punkt();
    @Test
    public void testPunkt(){
        p.verschiebePunkt(1000,200);
        assertEquals(1000,p.x);
        assertEquals(200, p.y);
    }
    @Test
    public void testPunkt2(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            p.verschiebePunkt(2000,300);
        });
        assertEquals("Außerhalb Bildschirm", exception.getMessage());
    }
    @Test
    public void testPunktNegativ(){
        RuntimeException exception = assertThrows(RuntimeException.class, () ->{
            p.verschiebePunkt(-1000,500);
        });
        assertEquals("Außerhalb Bildschirm", exception.getMessage());
    }
}
