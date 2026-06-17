package de.thws.maven.klausurvorbereitung.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args){
        TreeSet<String> woerter = new TreeSet<>(new Comparator<String>(){
            public int compare(String o1, String o2){
                return o2.compareTo(o1);
            }
        });

        woerter.add("A");
        woerter.add("B");
        woerter.add("C");
        woerter.add("D");

        System.out.println(woerter);
    }
}
