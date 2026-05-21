package de.thws.maven.lektion21.exam;

import java.io.IOException; //schlimmste Aufgabe überhaupt

public class FluentExam implements IExamBuilder, IExamWriter{

    public static IExamBuilder start(){
        return new FluentExam();
    }
    @Override
    public IExamWriter readQuestions() throws IOException {
        System.out.println("Fragen werden eingelesen ...");

        //vielleicht doch abbrechen????

        return this;
    }

    @Override
    public void toTest() throws IOException {
        System.out.println("LaTeX-Datei wird geschrieben ...");
    }
}
