package de.thws.maven.klausurvorbereitung.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bedienbar> liste = List.of(new Computer(), new Lampe());

        for(Bedienbar objekt : liste){
            objekt.einschalten();
            objekt.ausschalten();
        }

    }
}
