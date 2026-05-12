package de.thws.maven.lektion19.hangman;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public void startClient(String host, int port) throws IOException, ClassNotFoundException {
        try{
            Socket socket = new Socket(host, port);
            BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream serverAntwort = new ObjectInputStream(socket.getInputStream());

            GameStatus anfang = (GameStatus) serverAntwort.readObject();
            System.out.println(anfang.getWortBisher());

            System.out.println("Verbunden, bitte Text eingeben: ");
            String eingabe;

            while((eingabe = tastatur.readLine()) != null){
                Guess guess = new Guess(eingabe.charAt(0));

                oos.writeObject(guess);
                oos.flush();
                oos.reset();

                GameStatus antwort = (GameStatus) serverAntwort.readObject(); // Casten!!
                System.out.println("Server Antwort: "+antwort.getWortBisher());
                if(antwort.getErraten() == true){
                    System.out.println("Gewonnen!");
                    break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new TCPClient().startClient("localhost", 8000);
    }
}
