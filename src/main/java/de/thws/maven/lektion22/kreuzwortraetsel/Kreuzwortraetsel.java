package de.thws.maven.lektion22.kreuzwortraetsel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<>(new Comparator<String>(){
            public int compare(String o1, String o2){
                int laenge = Integer.compare(o1.length(), o2.length());
                if(laenge != 0) return laenge;
                else{
                    return o1.compareTo(o2);
                }
            }
        });
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}
