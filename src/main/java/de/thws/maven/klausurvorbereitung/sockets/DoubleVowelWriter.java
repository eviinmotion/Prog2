package de.thws.maven.klausurvorbereitung.sockets;

import java.io.IOException;
import java.io.Writer;

public class DoubleVowelWriter extends Writer {
    private final Writer out;

    public DoubleVowelWriter(Writer out){
        this.out = out;
    }
    @Override
    public void write(int c) throws IOException {
        char zeichen = (char) c;
        char[] vokaleGross = {'A', 'E', 'I', 'O', 'U'};
        char[] vokaleKlein = {'a', 'e', 'i', 'o', 'u'};
        boolean istVokal = false;
        for(int i = 0; i < vokaleGross.length; i++){
            if(zeichen == vokaleGross[i] || zeichen == vokaleKlein[i]){
                istVokal = true;
                break;
            }
        }
        if(istVokal){
            out.write(zeichen);
            out.write(zeichen);
        }
        else{
            out.write(zeichen);
        }
    }

    public void close() throws IOException {
        out.close();
    }

    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            this.write(cbuf[i]); // Ruft deine schlaue Methode von oben auf!
        }
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            this.write(str.charAt(i)); // Ruft auch deine Methode von oben auf!
        }
    }
}
