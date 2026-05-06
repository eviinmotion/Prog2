package de.thws.maven.lektion19.hangman;

import java.io.Serializable;

public class Guess implements Serializable {
    char letter;

    public Guess(char letter){
        this.letter = letter;
    }

    public char getLetter(){
        return letter;
    }
}
