package de.thws.maven.lektion16.inheritance;
import java.util.ArrayList;

public class Stack extends ArrayList implements IStack{
    public void push(Object o){
        this.add(o);
    }

    public Object pop(){
        if(this.isEmpty()){
            return null;
        }
        return this.remove(this.size()-1);
    }


}
