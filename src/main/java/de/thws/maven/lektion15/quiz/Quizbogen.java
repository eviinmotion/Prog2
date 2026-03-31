package de.thws.maven.lektion15.quiz;

public class Quizbogen {
    public static void main(String[] args){
        Quizfrage[] bogen = new Quizfrage[2];
        bogen[0] = new Textfrage("Wie lautet die Hauptstadt von Deutschland?", "München");
        String[] antwortenMC = {"100", "70", "90", "80"};
        bogen[1] = new MCFrage("Wie viele Einwohner leben in Deutschland?", antwortenMC);

        for(Quizfrage f : bogen){
            f.ausgeben();
        }
    }
}
