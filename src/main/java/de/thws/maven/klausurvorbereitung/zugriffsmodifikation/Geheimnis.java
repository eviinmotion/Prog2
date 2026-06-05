package de.thws.maven.klausurvorbereitung.zugriffsmodifikation;

public class Geheimnis {
    private String geheim1;
    String geheim2;
    protected String geheim3;
    public String geheim4;

    public void testIntern(){   //alles sichtbar, weil die eigene Klasse alles sehen kann
        System.out.println(geheim1);
        System.out.println(geheim2);
        System.out.println(geheim3);
        System.out.println(geheim4);
    }

}
