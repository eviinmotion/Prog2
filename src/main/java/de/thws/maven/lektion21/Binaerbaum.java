package de.thws.maven.lektion21;

public class Binaerbaum <T extends Comparable<T>> {
    private Element root;

    public Binaerbaum(){}

    public void addElement(T wert){
        Element neu = new Element(wert);
        if(root == null){
            root = neu;
            return;
        }
        Element current = root;
        while(true){
            if(neu.wert.compareTo(current.wert) < 0){ //compareTo liefert -1 wenn kleiner als andere Zahl und 1 wenn größer als andere Zahl
                if(current.links == null){
                    current.links = neu;
                    return;
                }
                current = current.links;
            }
            else{
                if (current.rechts == null) {
                    current.rechts = neu;
                    return;
                }
                current = current.rechts;
            }
        }

    }
    public Element getRoot(){
        return root;
    }

    public void ausgeben(){
        ausgebenRekursiv(root);
        System.out.println();
    }
    private void ausgebenRekursiv(Element current){
        if(current != null){
            ausgebenRekursiv(current.links);
            System.out.println(current.wert+ " ");
            ausgebenRekursiv(current.rechts);
        }
    }

    public class Element{
        private Element rechts;
        private Element links;
        private T wert;

        public Element(T wert){
            this.wert = wert;
        }

        public Element getRechts() {
            return rechts;
        }
        public Element getLinks(){
            return links;
        }
        public T getWert(){
            return wert;
        }
    }
}
