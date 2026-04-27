package de.thws.maven.lektion17.exceptions;

public class NullPointerException {
    public static void main(String[]args){
        String text = null;
        int laenge = text.length();
    }
}
