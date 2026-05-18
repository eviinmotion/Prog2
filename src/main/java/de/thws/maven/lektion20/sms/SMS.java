package de.thws.maven.lektion20.sms;

import java.io.*;

public class SMS {
    public void smsUmwandeln(File datei, File ziel) throws IllegalPhoneNumberException, IOException {
        try(
                BufferedReader br = new BufferedReader(new FileReader(datei));
                PrintWriter pw = new PrintWriter(new FileWriter(ziel));
                ){
            String zeile;
            while((zeile = br.readLine()) != null){
                try{
                    char[] buchstaben = zeile.toCharArray();
                    StringBuilder output = new StringBuilder();
                    for(char c : buchstaben){
                        boolean nurBuchstaben = false;
                        for(Legende letter : Legende.values()){
                            if(String.valueOf(c).equals(letter.name())){
                                output.append(letter.getZahl());
                                nurBuchstaben = true;
                                break;
                            }
                        }
                        if(!nurBuchstaben){
                            throw new IllegalPhoneNumberException("Ungültiges Zeichen gefunden!"+ c);
                        }
                    }
                    pw.println(output.toString());
                }catch(IllegalPhoneNumberException e){
                    System.err.println("Fehler gefunden in Zeile "+e.getMessage());
                }
            }
        }

    }
}
