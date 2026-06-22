package de.thws.maven.klausurvorbereitung.altklausuren.ss20;

import java.util.ArrayList;
import java.util.Collection;

public class ImmutableList<E> extends ArrayList<E> {

    public ImmutableList(Collection<? extends E> c){
        super(c);
    }

    @Override
    public boolean add(E e){
       throw new UnsupportedOperationException("List immutable!");
    }
}
