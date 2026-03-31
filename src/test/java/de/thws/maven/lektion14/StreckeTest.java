package de.thws.maven.lektion14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StreckeTest {
    @Test
    public void testStrecke() {
        Strecke strecke1 = new Strecke(8,4);
        Strecke strecke2 = new Strecke(9,2);

        assertEquals("4----8", strecke1.toString());
        assertEquals("2-------9", strecke2.toString());
        assertTrue(strecke1.schneide(strecke2));


        System.out.println(strecke1.schneide(strecke2));
        System.out.println(strecke1.toString());
        System.out.println(strecke2.toString());
    }
}
