package de.thws.maven.lektion16;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import de.thws.maven.lektion16.cyborg.*;

public class Gefahr {
    @Test
    public void testEntscheidung(){
        Roboter robot = new Roboter();
        Mensch man = new Mensch();
        Gefahrensituationen gefahr = Gefahrensituationen.GEFAHR_RECHTS;

        assertEquals(robot.entscheide(gefahr), Entscheide.LINKS);
        int counter = 0;
        for(int i = 0; i <= 1000; i++){
            if(man.entscheide(gefahr) == Entscheide.UNENTSCHIEDEN){
                counter++;
            }
        }
        assertTrue(counter > 200 && counter < 300);           //random kann nicht jedes mal genau 25 mal unentschieden machen
    }
    @Test
    public void testCyborgEntscheidung(){
        Cyborg cybi = new Cyborg();
        Gefahrensituationen gefahr  = Gefahrensituationen.GEFAHR_LINKS;

        for(int i = 0; i <= 1000; i++){
            Entscheide wahl = cybi.entscheide(gefahr);

            assertTrue(wahl == Entscheide.RECHTS || wahl == Entscheide.UNENTSCHIEDEN, "Cyborg hat eine Entscheidung getroffen: "+wahl);
        }
    }
}
