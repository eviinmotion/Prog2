package de.thws.maven.lektion17.streamverdopplung;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream
{
    private final OutputStream out1;
    private final OutputStream out2;

    public OutputStreamDoubler(OutputStream out1, OutputStream out2){
        this.out1 = out1;
        this.out2 = out2;
    }

    public void close() throws IOException{
        String fehler = "";
        try{
            out1.close();
        }catch(IOException e){
            fehler += e.getMessage();
        }
        try{
            out2.close();
        }catch(IOException e){
            fehler += e.getMessage();
        }
        if(!fehler.equals("")){
            throw new IOException(fehler);
        }
    }
    public void write(int b) throws IOException{
        try{
            out1.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            out2.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}

