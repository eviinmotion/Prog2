package de.thws.maven.lektion18.GZIP;

import java.io.*;
import java.net.*;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[] args){
        final int port = 5555;

        try(ServerSocket ss = new ServerSocket(port)){
            System.out.println("Server started on port " + port);
            try(Socket client = ss.accept();
                InputStream input = client.getInputStream();
                GZIPInputStream gzip = new GZIPInputStream(input);
                BufferedReader reader = new BufferedReader(new InputStreamReader(gzip));){
                String zeile;
                while((zeile = reader.readLine()) != null){
                    System.out.println("Entpackt "+zeile);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
