package de.thws.maven.lektion20.dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Multimap {
    Map<String, List<String>> multimap = new HashMap<>();
    void put(String key, String value);
    List<String> get(String key);
}
