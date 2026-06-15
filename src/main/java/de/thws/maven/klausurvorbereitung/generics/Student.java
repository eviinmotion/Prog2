package de.thws.maven.klausurvorbereitung.generics;

public class Student implements Comparable<Student>{
    private int punkte;

    public Student(int punkte){
        this.punkte = punkte;
    }

    public int getPunkte() {
        return punkte;
    }

    public int compareTo(Student other){
        return Integer.compare(this.punkte, other.punkte);
    }

    public String toString(){
        return "" + punkte;
    }
}
