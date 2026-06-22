package de.thws.maven.klausurvorbereitung.altklausuren.ss20;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {

    public static List<String> liesKonfigurationsdatei() throws IOException{
        return null;
    }

    public Map<String, String> erstelleKonfigurationsMap(){
        Map<String, String> result = new HashMap<>();

        try{
            List<String> zeilen = liesKonfigurationsdatei();

            for(String line : zeilen){
                int trennerIndex = line.indexOf('=');

                if(trennerIndex != -1){
                    String key = line.substring(0, trennerIndex);
                    String value = line.substring(trennerIndex+1, line.length());

                    result.put(key,value);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
