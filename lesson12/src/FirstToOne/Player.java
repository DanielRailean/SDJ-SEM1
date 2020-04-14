package FirstToOne;

public class Player
{
  private String name;
  private int score;
  public Player(String name){
    this.name = name;
    score = 50;
  }

  public String getName()
  {
    return name;
  }

  public int getScore()
  {
    return score;
  }

  public int roll(){
    int nr = Dice.roll();
    if(score-nr<1){
      score+=nr;
    }else{
      score-=nr;
    }
    return nr;
  }
}
