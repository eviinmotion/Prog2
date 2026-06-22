package de.thws.maven.klausurvorbereitung.altklausuren.ws22;

import java.util.ArrayList;
import java.util.List;

public class Flatten {
//Aufgabe a
    public List<String> flatten(List<List<String>> listOfLists){
        List<String> result = new ArrayList<>();
        for(List<String> innerList : listOfLists){
            if(innerList != null){
                for(String s : innerList){
                    result.add(s);
                }
            }
        }
        return result;
    }
    //Alternativ
    public List<String> flatten2(List<List<String>> listofLists){
        List<String> result = new ArrayList<>();
        for(List<String> innerList : listofLists){
            if(innerList != null){
                result.addAll(innerList);
            }
        }
        return result;
    }

    //Aufgabe b
    public <T> List<T> flattenGenerisch(List<List<T>> listOfLists){
        List<T> result = new ArrayList<>();
        for(List<T> objekt : listOfLists){
            if(objekt != null){
                result.addAll(objekt);
            }
        }
        return result;
    }

}

