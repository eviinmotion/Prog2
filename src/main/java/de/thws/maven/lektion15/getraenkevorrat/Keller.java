package de.thws.maven.lektion15.getraenkevorrat;

public class Keller {
    public static void main(String[] args){
        Getraenk[] keller = new Getraenk[3];
        keller[0] = new Bier("Eichhofen", "Helles", 5.0);
        keller[1] = new Weisswein("Randersacker","Silvaner", 12.50, 2022);
        keller[2] = new Rotwein("Lauda-Königshofen", "Rose", 12.5, 2021);

        for(Getraenk k : keller){
            System.out.println(k.toString());
            System.out.println(k.alkoholfrei());
            System.out.println();
        }
    }
}
