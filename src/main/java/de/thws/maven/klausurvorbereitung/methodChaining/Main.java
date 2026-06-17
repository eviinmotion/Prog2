package de.thws.maven.klausurvorbereitung.methodChaining;

public class Main {
    public static void main(String[] args){
        String test = new StringFormatter(" Hallo Java ")
                .trim()
                .replace("Java","Evi")
                .toUpper()
                .get();

        System.out.println(test);
    }
}
