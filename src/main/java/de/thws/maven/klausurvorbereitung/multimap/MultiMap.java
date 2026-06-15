package de.thws.maven.klausurvorbereitung.multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultiMap<K, V> {

    private HashMap<K, ArrayList<V>> map;

    public MultiMap(){
        this.map = new HashMap<>();
    }
    public void put(K key, V value){
        if(!this.map.containsKey(key)){
            this.map.put(key, new ArrayList<>());
        }
        this.map.get(key).add(value);
    }

    public List<V> get(K key){
        return this.map.get(key);
    }
}
