package de.thws.maven.lektion16;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import de.thws.maven.lektion16.inheritance.*;

public class StackTest {
    @Test
    public void testPushAndPop(){
        IStack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }
    @Test
    public void testPopLeeresStack(){
        IStack stack = new Stack();

        assertNull(stack.pop());
    }
}
