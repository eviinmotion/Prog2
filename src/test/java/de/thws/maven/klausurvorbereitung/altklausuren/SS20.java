package de.thws.maven.klausurvorbereitung.altklausuren;
import de.thws.maven.klausurvorbereitung.altklausuren.ss20.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SS20 {
    @Test
    public void testMap(){
        Konfigurator konfig = new Konfigurator();

        Map<String, String> map = konfig.erstelleKonfigurationsMap();

        assertEquals("smtp", map.get("mail.transport.protocol"));
        assertEquals("K[08a}5#", map.get("password"));
    }
}
