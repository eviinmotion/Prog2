package de.thws.maven.lektion17.exceptions;

public class NumberFormatException {
    public static void main(String[] args){
        //NumberFormatException
        String string = "keine Zahl";
        int stringToInt = Integer.parseInt(string);
    }
}
