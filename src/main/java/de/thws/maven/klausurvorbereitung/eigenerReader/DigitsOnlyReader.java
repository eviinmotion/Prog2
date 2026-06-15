package de.thws.maven.klausurvorbereitung.eigenerReader;

import java.io.IOException;
import java.io.Reader;

public class DigitsOnlyReader extends Reader {
    private final Reader input;

    public DigitsOnlyReader(Reader input) {
        this.input = input;
    }

    @Override
    public int read() throws IOException {
        int zeichen;

        while((zeichen = input.read()) != -1){
            if(zeichen >= '0' && zeichen <= '9'){
                return zeichen;
            }
        }
        return -1;
    }

    @Override
    public void close() throws IOException {
        input.close();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int count = 0;
        for(int i = 0; i < len; i++){
            int ch = read();
            if(ch == -1){
                return (count == 0) ? -1 : count;
            }
            cbuf[off+i] = (char)ch;
            count++;
        }
        return count;
    }
}
