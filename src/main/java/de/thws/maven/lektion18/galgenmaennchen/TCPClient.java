package de.thws.maven.lektion18.galgenmaennchen;
import java.io.*;
import java.net.Socket;

public class TCPClient {
    public void startClient(String host, int port){
        try{
            Socket socket = new Socket(host, port);
            BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader serverAntwort = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Verbunden, bitte Text eingeben: ");
            String eingabe;

            while((eingabe = tastatur.readLine()) != null){
                out.println(eingabe);

                String antwort = serverAntwort.readLine();
                System.out.println("Server Antwort: "+antwort);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new TCPClient().startClient("localhost", 8000);
    }
}
