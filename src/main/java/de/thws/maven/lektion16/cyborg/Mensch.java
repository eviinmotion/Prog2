package de.thws.maven.lektion16.cyborg;

public class Mensch implements Taetigkeiten {
    public void essen(){}
    public void schlafen(){}
    public void autofahren() {
    }
    public void arbeiten() {
    }
    public Entscheide entscheide(Gefahrensituationen gefahr) {
        if(Math.random() < 0.25){
            return Entscheide.UNENTSCHIEDEN;
        }
        switch(gefahr){
            case GEFAHR_LINKS: return Entscheide.RECHTS;
            case GEFAHR_RECHTS: return Entscheide.LINKS;
            case GEFAHR_VORNE: return Entscheide.BREMSEN;
            default: return Entscheide.UNENTSCHIEDEN;
        }
    }

}
