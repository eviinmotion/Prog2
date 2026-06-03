package de.thws.maven.klausurvorbereitung.befehlssystem;

public enum Befehl {
    START("System wird gestartet..."),
    STOP("System wird beendet..."),
    PAUSE("System wird pausiert..."),
    RESET("System wird zurückgesetzt...");

    private final String message;

    private Befehl(String message){
        this.message = message;
    }

    public void ausfuehren(){
        System.out.println(message);
    }
}
