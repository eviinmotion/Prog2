package de.thws.maven.lektion19.genericsStack;
import java.util.ArrayList;

public class StackArrayList<T> {
    private ArrayList<T> liste = new ArrayList<>();

    public void push(T object){
        liste.add(object);
    }

    public T pop(){
        if(liste.isEmpty()){
            return null;
        }
        return liste.remove(liste.size()-1);
    }


}
