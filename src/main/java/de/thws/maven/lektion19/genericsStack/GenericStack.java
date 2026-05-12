package de.thws.maven.lektion19.genericsStack;

import java.util.ArrayList;

public class GenericStack<T> extends ArrayList<T> implements IStack<T> {

    @Override
    public void push(T object){
        this.add(object);
    }

    @Override
    public T pop(){
        if(this.isEmpty()){
            return null;
        }
        return this.remove(this.size()-1);
    }


}
