package de.thws.maven.lektion18.GZIP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt".getBytes();
        Socket hostVerbindung = new Socket("localhost", 5555);

        OutputStream out = hostVerbindung.getOutputStream();

        try (GZIPOutputStream zipOut = new GZIPOutputStream(out)) {
            zipOut.write(bytesToTransfer);
            zipOut.flush();
        }
        hostVerbindung.close();
    }
}
