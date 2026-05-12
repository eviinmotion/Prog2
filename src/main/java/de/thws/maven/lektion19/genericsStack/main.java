package de.thws.maven.lektion19.genericsStack;

public class main {
    public static void main(String[] args){

        GenericStack<String> s = new GenericStack<>();

        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
