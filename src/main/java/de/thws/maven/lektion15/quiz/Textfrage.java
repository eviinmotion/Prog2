package de.thws.maven.lektion15.quiz;

public class Textfrage extends Quizfrage{
    String antwort;

    public Textfrage(String text, String antwort){
        super(text);
        this.antwort = antwort;
    }

    public void ausgeben(){
        System.out.println(this.text);
    }

    public void antwortPruefen(String eingabe){
        if(eingabe.equals(this.antwort)){
            System.out.println("Diese Antwort ist richtig!");
        }
        System.out.println("Diese Antwort ist falsch!");
    }
}
