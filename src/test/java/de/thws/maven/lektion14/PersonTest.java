package de.thws.maven.lektion14;
import org.junit.jupiter.api.Test;
public class PersonTest {
    @Test
    public void testPerson(){
        Adresse eviAdresse = new Adresse("Arnstein", "Grabenstrasse", "1" );
        Person evi = new Person("Eveline", "wojack", eviAdresse);

    }
}
