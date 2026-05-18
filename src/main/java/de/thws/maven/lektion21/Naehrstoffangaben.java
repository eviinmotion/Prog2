package de.thws.maven.lektion21;

public class Naehrstoffangaben {
    private final String portionsGroesse;
    private final int anzahlPortionen;
    private final double eiweiss;
    private final double fett;
    private final double kohlenhydrate;
    private final double natrium;

    private Naehrstoffangaben(String portionsGroesse, int anzahlPortionen, double eiweiss, double fett, double kohlenhydrate, double natrium) {
        this.portionsGroesse = portionsGroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    public String getPortionsGroesse() {
        return portionsGroesse;
    }
    public int getAnzahlPortionen() {
        return anzahlPortionen;
    }
    public double getEiweiss() {
        return eiweiss;
    }
    public double getFett() {
        return fett;
    }
    public double getKohlenhydrate() {
        return kohlenhydrate;
    }
    public double getNatrium() {
        return natrium;
    }

    public static class Builder{
        private String portionsGroesse;
        private int anzahlPortionen;
        private double eiweiss;
        private double fett;
        private double kohlenhydrate;
        private double natrium;


        public Builder(String portionsGroesse, int anzahlPortionen){
            this.portionsGroesse = portionsGroesse;
            this.anzahlPortionen = anzahlPortionen;
        }

        public Builder withEiweiss(double eiweiss){
            this.eiweiss = eiweiss;
            return this;
        }
        public Builder withFett(double fett){
            this.fett = fett;
            return this;
        }
        public Builder withKohlenhydrate(double kohlenhydrate){
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }
        public Builder withNatrium(double natrium){
            this.natrium = natrium;
            return this;
        }

        public Naehrstoffangaben build(){
            return new Naehrstoffangaben(portionsGroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
        }
    }
}
