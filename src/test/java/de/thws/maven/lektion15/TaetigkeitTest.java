package de.thws.maven.lektion15;
import org.junit.jupiter.api.Test;
import static de.thws.maven.lektion15.Person.*;
import static org.junit.jupiter.api.Assertions.*;
public class TaetigkeitTest {
    @Test
    public void TaetigkeitTesten(){
        Person[] personen = new Person[100];
        for(int i = 0; i < personen.length; i++){
            if(i % 2 == 0){
                personen[i] = new Student("Programmieren");
                personen[i].gibTaetigkeitAus();
            }
            else{
                personen[i] = new Professor("Programmieren");
                personen[i].gibTaetigkeitAus();
            }
        }
        assertEquals(100, personen.length);
    }

}
