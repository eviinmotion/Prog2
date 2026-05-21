package de.thws.maven.lektion21.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
    private List<Question> questions = new ArrayList<>();   //ein Exam-Objekt kann mehrere Question-Objekte speichern

    String readHeaderFromFile(){
        return "";
    }

    public void readQuestions() throws IOException {
        this.questions = Files.lines(Paths.get("questions.csv"))
                            .map(Question::toQuestion)
                            .collect(Collectors.toList());
    }

    public void toTest() throws IOException {
        List<String> lines = new ArrayList<>();

        lines.add(readHeaderFromFile()); //Header hinzufügen
        this.questions.stream()
                .map(q -> "\\textbf{"+q.text+"}\\\\")
                .forEach(lines::add);
        lines.add("\\end{document}");

        Files.write(Paths.get("test.tex"), lines);
    }
}
