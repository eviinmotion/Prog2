package de.thws.maven.klausurvorbereitung.palindomChecker;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(
                Socket server = new Socket("localhost", 9999);
                BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()))
        ){
            System.out.println("Bitte Wort eingeben: ");
            String line;
            while((line = user.readLine()) != null){
                writer.write(line);
                writer.newLine();
                writer.flush();

                String antwort = reader.readLine();
                System.out.println(antwort);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
