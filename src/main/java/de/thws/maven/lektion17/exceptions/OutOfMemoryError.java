package de.thws.maven.lektion17.exceptions;

public class OutOfMemoryError {
    public static void main(String[] args){
        long[] riesig = new long[Integer.MAX_VALUE];
    }
}
