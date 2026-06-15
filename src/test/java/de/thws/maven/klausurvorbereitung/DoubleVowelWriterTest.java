package de.thws.maven.klausurvorbereitung;

import de.thws.maven.klausurvorbereitung.sockets.DoubleVowelWriter;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleVowelWriterTest {
    @Test
    public void testWrite() {
        try(
                Writer writer = new DoubleVowelWriter(new FileWriter("test.txt"))
                ){
            writer.write("Haus");
        }catch(IOException e){
            System.err.println("schreiben fehlgeschlagen"+ e.getMessage());
        }

        try(
                BufferedReader reader = new BufferedReader(new FileReader("test.txt"))
                ){
            String ergebnis = reader.readLine();
            assertEquals("Haauus", ergebnis);
        }catch(IOException e){
            System.err.println("lesen fehlgeschlagen"+ e.getMessage());
        }
    }
}
