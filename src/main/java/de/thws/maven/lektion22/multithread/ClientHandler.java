package de.thws.maven.lektion22.multithread;

import java.io.*;
import java.net.Socket;
import java.util.List;

import static de.thws.maven.lektion22.PrimzahlThread.testeObPrimzahl;

public class ClientHandler extends Thread {
    private Socket socket;
    private List<Integer> zahlenListe;

    public ClientHandler(Socket socket, List<Integer> zahlenListe) {
        this.zahlenListe = zahlenListe;
        this.socket = socket;
    }

    @Override
    public void run() {
        try(PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
                ){
            for(int zahl : zahlenListe){
                boolean ergebnis = testeObPrimzahl(zahl);
                out.println(ergebnis);
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
