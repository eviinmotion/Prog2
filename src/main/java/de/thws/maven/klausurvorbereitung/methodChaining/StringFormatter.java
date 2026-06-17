package de.thws.maven.klausurvorbereitung.methodChaining;

public class StringFormatter {
    private String text;

    public StringFormatter(String text){
        this.text = text;
    }

    public StringFormatter toUpper(){
        this.text = this.text.toUpperCase();
        return this;
    }

    public StringFormatter replace(String alt, String neu){
        this.text = this.text.replace(alt, neu);
        return this;
    }

    public StringFormatter trim(){
        this.text = this.text.trim();
        return this;
    }

    public String get(){
        return this.text;
    }
}
