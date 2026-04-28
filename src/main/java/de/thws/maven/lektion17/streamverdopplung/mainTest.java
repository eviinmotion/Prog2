package de.thws.maven.lektion17.streamverdopplung;

import java.io.FileOutputStream;
import java.io.IOException;

public class mainTest {
    public static void main(String[] args) {
        FileOutputStream fos1 = null;
        FileOutputStream fos2 = null;
        OutputStreamDoubler doubler = null;

        try{
            fos1 = new FileOutputStream("file1.txt");
            fos2 = new FileOutputStream("file2.txt");

            doubler = new OutputStreamDoubler(fos1,fos2);

            String test = "Das landet in 2 Dateien";
            byte[] daten = test.getBytes();

            doubler.write(daten);

            System.out.println("Daten wurden verdoppelt!");

        }catch(IOException e){
            System.out.println("Fehler aufgetreten: "+e.getMessage());
            e.printStackTrace();
        }finally{
            try{
                if(doubler != null){
                    doubler.close();
                }
            }catch(IOException e){
                System.out.println("Fehler beim schließen: "+e.getMessage());
            }
        }
    }
}
