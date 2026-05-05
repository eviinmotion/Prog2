package de.thws.maven.lektion18.upperCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest
{
    private String writer(char inputChar){
        try(
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(baos);
                ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
                ){
            writer.write(inputChar);
            writer.flush();
            return baos.toString();

        }catch(IOException e){
            fail("IOException"+e.getMessage());
            return null;
        }

    }

  @Test
  public void writeCharTest()
  {
    assertEquals("A", writer('a'));
  }

  @Test
  public void writeCharTestWithNonChar()
  {
    assertEquals("1", writer('1'));
  }

  @Test
    public void testAsciiLetters(){
        for(char c ='a'; c<= 'z'; c++){
            String expected = String.valueOf(Character.toUpperCase(c));
            assertEquals(expected, writer(c));
        }
  }
  @Test
    public void testAsciiZeichen(){
        for(int i = 0; i < 128; i++){
            char c = (char) i;
            if(c >= 'a' && c <= 'z') continue;
            String expected = String.valueOf(c);
            assertEquals(expected, writer(c));
        }
  }
}
