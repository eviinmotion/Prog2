package de.thws.maven.lektion21.exam;

import java.io.IOException;

public interface IExamBuilder {
    IExamWriter readQuestions() throws IOException;

    //stellt sicher dass man erst liest bevor man schreibt
    //wer erst gelesen gelangt erst in die andere methode
}
