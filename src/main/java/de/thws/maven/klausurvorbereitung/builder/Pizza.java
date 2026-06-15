package de.thws.maven.klausurvorbereitung.builder;

public class Pizza {
    private String groesse;
    private boolean kaese;
    private boolean schinken;
    private boolean pilze;
    private boolean salami;

    public Pizza(String groesse,  boolean kaese, boolean schinken, boolean pilze, boolean salami){
        this.groesse = groesse;
        this.kaese = kaese;
        this.schinken = schinken;
        this.pilze = pilze;
        this.salami = salami;
    }

    public static class Builder{
        private String groesse;
        private boolean kaese, schinken, pilze, salami;

        public Builder(String groesse){
            this.groesse = groesse;
        }

        public Builder mitKaese(boolean kaese){
            this.kaese = kaese;
            return this;
        }
        public Builder mitSchinken(boolean schinken){
            this.schinken = schinken;
            return this;
        }
        public Builder mitPilze(boolean pilze){
            this.pilze = pilze;
            return this;
        }
        public Builder mitSalami(boolean salami){
            this.salami = salami;
            return this;
        }

        public Pizza build(){
            return new Pizza(groesse, kaese, schinken, pilze, salami);
        }
    }

    public static void main(String args[]){

        Pizza pizza = new Pizza.Builder("Klein")
                .mitKaese(true)
                .mitSchinken(false)
                .mitPilze(true)
                .mitSalami(true)
                .build();
    }
}
