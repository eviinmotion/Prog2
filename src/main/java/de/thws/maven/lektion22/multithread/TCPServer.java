package de.thws.maven.lektion22.multithread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TCPServer {
    public static void main(String []args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        while(true){
            Socket client = serverSocket.accept();
            if(client != null){
                List<Integer> zahlen = new ArrayList<>(List.of(3,4,5,6,7));
                ClientHandler handler = new ClientHandler(client, zahlen);
                handler.start();
            }
        }
    }
}
