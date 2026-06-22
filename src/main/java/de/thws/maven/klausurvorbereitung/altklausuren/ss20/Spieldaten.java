package de.thws.maven.klausurvorbereitung.altklausuren.ss20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Spieldaten implements Serializable {
    private int geld;
    ImmutableList<String> spielerIDs;

    private Spieldaten(int geld, List<String> temp) {
        this.geld = geld;
        this.spielerIDs = new ImmutableList<>(temp);
    }

    public static class SpieldatenBuilder{
        private int geld;
        private List<String> temp = new ArrayList<>();

        public SpieldatenBuilder(){
        }

        public SpieldatenBuilder add(String spielerID){
            this.temp.add(spielerID);
            return this;
        }
        public SpieldatenBuilder geld(int geld){
            this.geld = geld;
            return this;
        }

        public Spieldaten build(){
            return new Spieldaten(this.geld, this.temp);
        }
    }
}
