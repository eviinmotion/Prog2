package de.thws.maven.lektion16.schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett altes){
      Brett ergebnis = new Brett();
      for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){
            if(this.brett[i][j] || altes.brett[i][j]){ //wenn altes oder neues brett jeweils markiert ist, markiere weiter
              ergebnis.brett[i][j] = true;
            }
        }
      }
      return ergebnis;
  }
  
}
