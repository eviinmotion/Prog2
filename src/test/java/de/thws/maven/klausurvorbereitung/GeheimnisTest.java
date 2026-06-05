package de.thws.maven.klausurvorbereitung;

import org.junit.jupiter.api.Test;
import de.thws.maven.klausurvorbereitung.zugriffsmodifikation.*;

public class GeheimnisTest {
    @Test
    public void testGeheimnis() {           //nur public ist sichtbar
        Geheimnis g = new Geheimnis();
        //System.out.println(g.geheim1);
        //System.out.println(g.geheim2);
        //System.out.println(g.geheim3);
        System.out.println(g.geheim4);
    }
}
