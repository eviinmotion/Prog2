package de.thws.maven.lektion20.maumau.dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.put("clean", "reinigen");
        dictionary.put("clean", "säubern");
        dictionary.put("clean", "putzen");
        dictionary.put("expand","vergrößern");
        dictionary.put("expand", "wachsen");

        System.out.println(dictionary.get("clean"));
        System.out.println(dictionary.get("expand"));
    }
}
