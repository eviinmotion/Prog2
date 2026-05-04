package de.thws.maven.lektion18.galgenmaennchen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.System.out;

public class TCPServer {
    public void startServer(int port){
        String geheimnis = "INFORMATIK";
        char[] stand = new char[geheimnis.length()];
        for(int i = 0; i < geheimnis.length(); i++) {
            stand[i] = '_';
        }
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on port "+port+"\n Galgenmännchen bereit");
            try(Socket clientSocket = serverSocket.accept();
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)){
                out.println("Das Wort lautet: "+String.valueOf(stand));

                String eingabe;

                while((eingabe = input.readLine()) != null){
                    if(eingabe.isEmpty())
                        continue;

                    char geraten = eingabe.toUpperCase().charAt(0);
                    boolean gefunden = false;

                    for(int i = 0; i < stand.length; i++) {
                        if(geheimnis.charAt(i) == geraten){
                            gefunden = true;
                            stand[i] = geraten;
                        }
                    }
                    String antwort = gefunden ? "Richtig!":"Falsch!"; //for each: wenn gefunden true: richtig, wenn gefunden false : falsch

                    antwort += "Stand: "+String.valueOf(stand);

                    if(String.valueOf(stand).equals(geheimnis)){
                        out.println("Gewonnen!");
                        System.out.println("Client hat gewonnen!");
                        break;
                    }

                    out.println(antwort);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
