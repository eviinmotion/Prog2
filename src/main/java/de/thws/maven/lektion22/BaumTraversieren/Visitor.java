package de.thws.maven.lektion22.BaumTraversieren;

public interface Visitor<T> {

    public void visit(Baum.Knoten<T> current);

}
