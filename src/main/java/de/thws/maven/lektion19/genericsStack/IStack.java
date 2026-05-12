package de.thws.maven.lektion19.genericsStack;

public interface IStack<T> {
    void push(T object);
    T pop();
}
