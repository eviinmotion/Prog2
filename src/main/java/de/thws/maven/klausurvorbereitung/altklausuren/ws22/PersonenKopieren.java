package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

import java.io.*;

public class PersonenKopieren implements Serializable {

    public Person gibKopie(Person p){
        if(p == null){
            return null;
        }
        try(
                ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);
                ){
            objectOut.writeObject(p);   //zerlegt p in atomare Bestandteile
            objectOut.flush();          //stellt sicher dass der Stream verschickt wurde

            byte[] data = byteOut.toByteArray(); //geschriebenen Bytes aus byteOut holen

            try( //aus dem Byte Array wieder ein Objekt lesen
                    ByteArrayInputStream byteIn = new ByteArrayInputStream(data);
                    ObjectInputStream objectIn = new ObjectInputStream(byteIn);
                    ){
                return (Person) objectIn.readObject(); //wichtig zu Person wieder casten
            }
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
