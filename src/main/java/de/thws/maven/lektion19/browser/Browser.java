package de.thws.maven.lektion19.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {
    public Optional<URL> back() {
        try {
            //simulate: fetch last URL from Stack
            return Optional.ofNullable(Math.random() < 0.5 ? new URL("http://google.de") : null);
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url) {
        //simulate download site:
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Normal back");
        Browser browser = new Browser();
        Optional<URL> back = browser.back();    //Rückgabetyp muss mit Instanziierung in Main übereinstimmen
        back.ifPresent(browser::retrieveSite);   // :: ist Methodenreferenz

    }
}
