package de.thws.maven.klausurvorbereitung.palindomChecker;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static de.thws.maven.klausurvorbereitung.palindomChecker.Palindrom.istPalindrom;

public class Server {
    public static void main(String[] args) {
        try(
                ServerSocket ss = new ServerSocket(9999);
                Socket client = ss.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))
                ){
            String line;
            while((line = reader.readLine()) != null){
                writer.write(istPalindrom(line));
                writer.newLine();
                writer.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
