package de.thws.maven.lektion20.kartenspiel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Skat implements Kartenspiel {
    List<Karte> skat = new ArrayList<>();

    public Skat(){
        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                skat.add(new Karte(r, s));
            }
        }
        Collections.shuffle(skat);
    }
    @Override
    public void austeilen(Hand spielerhand){
        for(int i = 0; i < 10; i++){
            if(!skat.isEmpty()){
                Karte gezogeneKarte = skat.remove(0);   //ab 0 weil wir die oberste Karte vom Deck ziehen
                spielerhand.karteZiehen(gezogeneKarte);

            }
        }
    }
}
