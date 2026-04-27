package de.thws.maven.lektion16.inheritance;
import java.util.ArrayList;

public class StackArrayList {
    private ArrayList liste = new ArrayList();

    public void push(Object o){
        liste.add(o);
    }

    public Object pop(){
        if(liste.isEmpty()){
            return null;
        }
        return liste.remove(liste.size()-1);
    }


}
