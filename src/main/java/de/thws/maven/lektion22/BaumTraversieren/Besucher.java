package de.thws.maven.lektion22.BaumTraversieren;

import static de.thws.maven.lektion22.BaumTraversieren.Baum.*;

public class Besucher<E> implements Visitor<E>{
    int counter = 0;

    @Override
    public void visit(Knoten current){
        counter++;
    }
    public int getCount(){
        return counter;
    }
}
