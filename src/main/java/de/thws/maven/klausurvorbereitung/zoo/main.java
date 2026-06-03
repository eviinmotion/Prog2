package de.thws.maven.klausurvorbereitung.zoo;

import java.util.List;

public class main {
    public static void main(String[] args){
        Zootier[] zoo = {new Elefant(), new Papagei(), new Loewe()};

        for(Zootier tier : zoo){
            tier.makeSound();
        }

        List.of(new Elefant(), new Papagei(), new Loewe())
                .forEach(tier -> tier.makeSound());
    }
}
