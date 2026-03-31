package de.thws.maven.lektion15.quiz;

abstract class Quizfrage {
    String text;

    Quizfrage(String text){
        this.text = text;
    }

    public abstract void ausgeben();

}
