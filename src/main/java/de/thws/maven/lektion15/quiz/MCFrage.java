package de.thws.maven.lektion15.quiz;

public class MCFrage extends Quizfrage{
    String[] antworten = new String[4];

    public MCFrage(String text, String[] antworten){
        super(text);
        this.antworten = antworten;
    }

    public void ausgeben(){
        System.out.println(this.text);
        for(int i = 0; i < antworten.length; i++){
            char label = 'A';
            System.out.println(label + " "+ antworten[i]);
            label++;
        }
    }



}
