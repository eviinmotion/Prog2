package de.thws.maven.lektion16;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import de.thws.maven.lektion16.muenzautomat.NewChangeCalculator;

public class muenzautomatTest {
    @Test
    public void testChange450() {
        NewChangeCalculator calc = new NewChangeCalculator();
        int[] erwartet = {0,0,0,0,0,1,0,2};
        assertArrayEquals(erwartet, calc.getChange(4,50));
    }
    @Test
    public void testChange399() {
        NewChangeCalculator calc = new NewChangeCalculator();
        int[] erwartet = {0,2,1,0,2,1,1,1};
        assertArrayEquals(erwartet, calc.getChange(3,99));
    }
    @Test
    public void testChange187() {
        NewChangeCalculator calc = new NewChangeCalculator();
        int[] erwartet = {0,1,1,1,1,1,1,0};
        assertArrayEquals(erwartet, calc.getChange(1,87));
    }
}
