package de.thws.maven.lektion17;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutPutStream {
    @Test
    void OffsetNegative(){
        ByteArrayOutputStream out =  new ByteArrayOutputStream();
        byte[] buffer = new byte[10];

        assertThrows(IndexOutOfBoundsException.class, () -> out.write(buffer, -1, 5));
    }
    @Test
    void lengthNegative(){
        ByteArrayOutputStream out =  new ByteArrayOutputStream();
        byte[] buffer = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> out.write(buffer, 0, -1));
    }
    @Test
    void lengthGreaterThanArray(){
        ByteArrayOutputStream out =  new ByteArrayOutputStream();
        byte[] buffer = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> out.write(buffer, 5, 11));
    }
    @Test
    void arrayIsNull(){
        ByteArrayOutputStream out =  new ByteArrayOutputStream();
        assertThrows(NullPointerException.class, () -> out.write(null, 0, 5));
    }
}
