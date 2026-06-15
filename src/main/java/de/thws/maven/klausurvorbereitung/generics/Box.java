package de.thws.maven.klausurvorbereitung.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();
    public void add(T e){
        this.elements.add(e);
    }
    public T max(){
        return Collections.max(elements);
    }
}
