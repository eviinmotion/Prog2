package de.thws.maven.lektion23;

public class Bundesliga {
    public static void main(String[] args){

        Mannschaft.createTabelle()
                .stream().filter(m -> m.punkte > 50)
                .forEach(m -> System.out.println(m));
                //aufgabe a - b

        Mannschaft.createTabelle()
                .stream()
                .map(m -> m.name)
                .forEach(name -> System.out.println(name));
                //aufgabe c

        Mannschaft.createTabelle()
                .stream()
                .filter(m -> m.name.charAt(0) == 'F')
                .map(m -> m.name) //wandelt objekt Mannschaft in Strings um
                .sorted()   //sortiert alphabetisch
                .forEach(name -> System.out.println(name));

        Mannschaft.createTabelle()
                .stream()
                .max((m1, m2) -> Integer.compare(m1.gegentore, m2.gegentore))
                .ifPresent(m -> System.out.println(m));
    }
}
