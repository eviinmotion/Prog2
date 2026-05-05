package de.thws.maven.lektion16.schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            int abstandX = Math.abs(this.x-i);       //berechne wie viele felder es sich bewegen soll
            int abstandY = Math.abs(this.y-j);       //mathabs nimmt vorzeichen weg

            if(abstandX == abstandY && abstandX != 0){ //!=0 damit läufer nicht das feld markiert auf dem er gerade steht -> so wie ich mich auf der XAchse bewege, so bewege ich mich auf der YAchse
                brett.markiereFeld(i, j); //i & j weil wir die in der forschleife ablaufen vorher
            }
        }
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
