package de.thws.maven.lektion21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaerbaumTest {
    @Test
    public void testSortierung(){
        Binaerbaum<Integer> baum = new Binaerbaum<>();

        baum.addElement(19);
        baum.addElement(5);
        baum.addElement(20);

        assertEquals(19, baum.getRoot().getWert());
        assertEquals(5, baum.getRoot().getLinks().getWert());
        assertEquals(20, baum.getRoot().getRechts().getWert());
    }
}
