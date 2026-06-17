package de.thws.maven.klausurvorbereitung.streamOperationen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationen {
    public static void main(String[] args){
        List<String> namen = Arrays.asList("Anna", "Boris", "Clara", "Anton", "Benjamin");
        Stream<String> stream = namen.stream();

        namen.stream().filter(n -> n.startsWith("A"));
        namen.stream().map(String::toUpperCase);

        long counter = namen.stream()
                .filter(s -> s.toLowerCase().contains("n"))
                .count();

    }
}
