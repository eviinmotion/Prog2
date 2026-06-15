package de.thws.maven.klausurvorbereitung;

import org.junit.jupiter.api.Test;
import de.thws.maven.klausurvorbereitung.generics.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GenericsTest {
    @Test
    public void testInteger(){
        Box<Integer> integer = new Box<>();
        integer.add(10);
        integer.add(50);
        integer.add(30);
        integer.add(22);

        assertEquals(50, integer.max());
    }
    @Test
    public void testString(){
        Box<String> string = new Box<>();
        string.add("hello");
        string.add("world");
        string.add("student");

        assertEquals("world", string.max());
    }

    @Test
    public void testStudent(){
        Box<Student> student = new Box<>();
        student.add(new Student(30));
        student.add(new Student(20));
        student.add(new Student(80));

        assertEquals(80, student.max().getPunkte());
    }
}
