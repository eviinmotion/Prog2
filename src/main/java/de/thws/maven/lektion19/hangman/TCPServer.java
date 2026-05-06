package de.thws.maven.lektion19.hangman;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public void startServer(int port) throws ClassNotFoundException, IOException{
        String geheimnis = "INFORMATIK";
        char[] stand = new char[geheimnis.length()];
        for(int i = 0; i < geheimnis.length(); i++) {
            stand[i] = '_';
        }
        int restlicheVersuche = 10;
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on port "+port+"\n Galgenmännchen bereit");
            try(Socket clientSocket = serverSocket.accept();
                ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());){
                GameStatus antwort = new GameStatus(String.valueOf(stand), false, false, restlicheVersuche);   //toString gibt nur Speicheradresse wieder
                output.writeObject(antwort);
                output.flush();

                Guess eingabe;
                while((eingabe = (Guess) input.readObject()) != null){  //wichtig !! Casten sonst kompiliert es nicht

                    char geraten = eingabe.getLetter();
                    boolean gefunden = false;

                    for(int i = 0; i < stand.length; i++) {
                        if(geheimnis.charAt(i) == geraten){
                            gefunden = true;
                            stand[i] = geraten;
                        }
                    }
                    if(!gefunden){
                        restlicheVersuche--;
                    }
                    boolean gewonnen = String.valueOf(stand).equals(geheimnis);
                    antwort = new GameStatus(String.valueOf(stand), gefunden, gewonnen, restlicheVersuche);

                    output.writeObject(antwort);
                    output.flush();  //puffer leeren
                    output.reset();  //cache leeren
                    if(gewonnen || antwort.getVersuche() == 0){
                        break;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException{
        new TCPServer().startServer(8000);
    }
}
