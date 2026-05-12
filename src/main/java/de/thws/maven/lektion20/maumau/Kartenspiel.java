package de.thws.maven.lektion20.maumau;

import java.util.ArrayList;
import java.util.List;

public interface Kartenspiel {
    List<Karte> spiel = new ArrayList<>();

    default void austeilen(Hand spielerhand){

    }
}
