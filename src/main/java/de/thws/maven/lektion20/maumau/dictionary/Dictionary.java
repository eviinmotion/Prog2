package de.thws.maven.lektion20.maumau.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary implements Multimap {

    Map<String, List<String>> multimap = new HashMap<>();

    public void put(String key, String value) {
        if(!multimap.containsKey(key)) {
            multimap.put(key, new ArrayList<>());
        }
        multimap.get(key).add(value);
    }

    public List<String> get(String key){
        return multimap.getOrDefault(key, new ArrayList<>());
    }
}
