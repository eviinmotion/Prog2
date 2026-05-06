package de.thws.maven.lektion19.hangman;

import java.io.Serializable;

import static java.lang.System.out;

public class GameStatus implements Serializable {
    String wortBisher;
    boolean hitLetter;
    boolean spielBeenden;
    boolean erraten;
    int versuche;

    public GameStatus(String wortBisher, boolean hitLetter, boolean erraten, int restlicheVersuche){
        this.wortBisher = wortBisher;
        this.hitLetter = hitLetter;
        this.erraten = erraten;
        if(erraten){
            this.spielBeenden = true;
        }
        this.versuche = restlicheVersuche;
    }
    public String getWortBisher(){
        return wortBisher;
    }
    public void setWortBisher(String wortBisher){
        this.wortBisher = wortBisher;
    }
    public boolean getHitLetter(){
        return hitLetter;
    }
    public void setHitLetter(boolean hitLetter){
        this.hitLetter = hitLetter;
    }
    public boolean getErraten(){
        return erraten;
    }
    public void setErraten(){
        this.erraten = true;
    }
    public int getVersuche(){
        return versuche;
    }

    public void getGameStatus(){
        out.println(wortBisher + "Treffer? "+hitLetter +"Erraten? "+erraten+"Restliche Versuche: "+versuche);
    }
}
