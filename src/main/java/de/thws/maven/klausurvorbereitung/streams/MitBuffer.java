package de.thws.maven.klausurvorbereitung.streams;

import java.io.*;
import java.util.Scanner;

public class MitBuffer {
    public static void main(String[] args){
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("quelle.dat"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("ziel.dat"))
                ){
            byte[] buffer = new byte[4096];
            int n;
            while((n = in.read(buffer)) != -1){
                out.write(buffer, 0, n);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(scanner.nextLine()));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(scanner.nextLine()))
                ){
            byte[] buffer = new byte[4096];
            int n;
            while((n = in.read(buffer)) != -1){
                out.write(buffer, 0, n);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        File quelle = new File("quelle.dat");
        long quelleLaenge = quelle.length();

        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("quelle.dat"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("ziel.dat"))
                ){
            byte[] buffer = new byte[4096];
            int n;
            while((n = in.read(buffer)) != -1){
                out.write(buffer, 0, n);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        File ziel = new File("ziel.dat");
        long zielLaenge = ziel.length();
        if(zielLaenge == quelleLaenge){
            System.out.println(zielLaenge);
        }
    }
}
