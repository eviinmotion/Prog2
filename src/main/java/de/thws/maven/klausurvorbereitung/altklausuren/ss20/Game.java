package de.thws.maven.klausurvorbereitung.altklausuren.ss20;

public interface Game {
    void reset();
    String initGameString();
    String welcomeString();
    String handleInput();
    boolean running();


}
