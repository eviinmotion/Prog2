package de.thws.maven.lektion17.byteStreams;

import java.io.*;

public class Zeitmessung {
    public static void copyUnbuffered(File source, File dest) throws IOException {
        try(InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(dest)){
            int data;
            while ((data = in.read()) != -1){
                out.write(data);
            }
        }
    }
    public static void copyBuffered(File source, File dest) throws IOException {
        try(InputStream in = new BufferedInputStream(new FileInputStream(source));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(dest))){
            int data;
            while ((data = in.read()) != -1){
                out.write(data);
            }
        }
    }

    public static void copyArray(File source, File dest) throws IOException{
        try(InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest)){
            byte[] buffer = new byte[1024];
            int bytesGelesen;
            while((bytesGelesen = in.read(buffer)) != -1){
                out.write(buffer, 0, bytesGelesen);
            }
        }
    }
}
