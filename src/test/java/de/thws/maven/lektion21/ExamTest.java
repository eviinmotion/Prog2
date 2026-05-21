package de.thws.maven.lektion21;

import de.thws.maven.lektion21.exam.Exam;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamTest {
    @Test
    public void testExam() throws IOException {
        Exam exam = new Exam();

        exam.readQuestions();
        exam.toTest();

        assertTrue(Files.exists(Paths.get("test.tex")));
    }
}
