package de.thws.maven.lektion14;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b){
        if(a < 0 || b < 0 ){
            throw new IllegalArgumentException("Zahlen müssen positiv sein!");
        }
        if(a<b){
            this.a = a;
            this.b = b;
        }
        else{
            this.a = b;
            this.b = a;
        }
    }
    public boolean schneide(Strecke andere){
        if(this.a < andere.b && andere.a < this.b) {
            return true;
        }
        return false;
    }
    public String toString(){
        if(this.a == this.b){
            return ""+this.a;
        }
        String striche = "";
        int abstand = this.b - this.a;
        for(int i = 1; i <= abstand; i++){
            striche += "-";
        }
        return this.a + striche + this.b;
    }
}
