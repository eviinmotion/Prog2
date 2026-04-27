package de.thws.maven.lektion16.cyborg;

public class Roboter implements Taetigkeiten{
    public void autofahren(){}
    public void arbeiten(){}
    public void aufladen(){}
    public void warten(){}

    public Entscheide entscheide(Gefahrensituationen gefahr){
        switch(gefahr){
            case GEFAHR_LINKS: return Entscheide.RECHTS;
            case GEFAHR_RECHTS: return Entscheide.LINKS;
            case GEFAHR_VORNE: return Entscheide.BREMSEN;
            default: return Entscheide.UNENTSCHIEDEN;
        }
    }
}
