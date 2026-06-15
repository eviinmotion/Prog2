package de.thws.maven.klausurvorbereitung.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Buch> regal = new ArrayList<>();
        regal.add(new Buch("Vom Winde verweht", 100));
        regal.add(new Buch("Harry Potter", 700));
        regal.add(new Buch("Herr der Ringe", 800));
        regal.add(new Buch("In Wahrheit wird viel mehr gelogen", 300));
        regal.add(new Buch("The Craving Mind", 200));
        regal.add(new Buch("Anatomie des Staates", 800));

        Collections.sort(regal);

        for(Buch b : regal){
            System.out.println(b.toString());
        }
    }
}
