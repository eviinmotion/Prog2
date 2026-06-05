package de.thws.maven.klausurvorbereitung.zugriffsmodifikation;

public class SubGeheimnis extends Geheimnis{

    public void testeGeheimnis(){
        //System.out.println(geheim1);            //geheim1 nicht sichtbar weil es nur die Oberklasse sehen darf
        System.out.println(geheim2);
        System.out.println(geheim3);
        System.out.println(geheim4);
    }
}
