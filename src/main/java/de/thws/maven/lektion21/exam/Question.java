package de.thws.maven.lektion21.exam;

public class Question {
    String text;

    public static Question toQuestion(String line){
        Question q = new Question();
        q.text = line;
        return q;
    }
}
