package de.thws.maven.lektion19;

import de.thws.maven.lektion19.browser.Browser;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {
    Browser browser = new Browser();
    @Test
    public void testBrowserNotNull() {
        assertNotNull(browser.back());
    }
    @Test
    public void testBrowserBack(){
        Optional<URL> result = browser.back();
        assertTrue(result.isEmpty() || result.isPresent());
    }

    @Test
    public void testZufaelle(){
        boolean foundPresent = false;
        boolean foundEmpty = false;

        for(int i = 0; i < 100; i++){
            Optional<URL> result = browser.back();
            if(result.isPresent()) foundPresent = true;
            if(result.isEmpty()) foundEmpty = true;
        }
        assertTrue(foundPresent);
        assertTrue(foundEmpty);     //alles außer Null
    }
}
