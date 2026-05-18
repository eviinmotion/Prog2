package de.thws.maven.lektion20.kartenspiel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MauMau implements Kartenspiel {
    List<Karte> mauMau = new ArrayList<>();

    public MauMau(){
        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                mauMau.add(new Karte(r, s));
            }
        }
        Collections.shuffle(mauMau);
    }

    @Override
    public void austeilen(Hand spielerHand){
        for(int i = 0; i < 7; i++){
            if(!mauMau.isEmpty()){
                Karte gezogeneKarte = mauMau.remove(0);   //ab 0 weil wir die oberste Karte vom Deck ziehen
                spielerHand.karteZiehen(gezogeneKarte);

            }
        }
    }

}
