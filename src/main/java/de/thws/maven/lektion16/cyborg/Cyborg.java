package de.thws.maven.lektion16.cyborg;

public class Cyborg implements Taetigkeiten{
    private Mensch menschAnteil;
    private Roboter robotAnteil;

    public Cyborg(){
        this.menschAnteil = new Mensch();
        this.robotAnteil = new Roboter();
    }

    public void autofahren(){}
    public void arbeiten(){}
    public Entscheide entscheide(Gefahrensituationen gefahr){
        Entscheide entscheidungRobo = robotAnteil.entscheide(gefahr);
        Entscheide entscheidungMensch = menschAnteil.entscheide(gefahr);
        if(entscheidungRobo == entscheidungMensch){
            return entscheidungRobo;
        }
        if(Math.random() < 0.5){
            return entscheidungMensch;
        }
        return entscheidungRobo;
    }

}
