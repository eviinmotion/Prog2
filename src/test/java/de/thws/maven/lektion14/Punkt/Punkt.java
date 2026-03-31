package de.thws.maven.lektion14.Punkt;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX < 0 || zielY < 0 || zielX >= 1920 || zielY >= 1080){
            throw new RuntimeException("Außerhalb Bildschirm");
        }
        x = zielX;
        y = zielY;
    }
}
