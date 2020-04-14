package FirstToOne;

public class Game
{
  public static void main(String[] args)
  {
    Player nr1 = new Player("Daniel");
    Player nr2 = new Player("Den");
    while(nr1.getScore()!=1&& nr2.getScore()!=1){
      System.out.println(nr1.getName()+" rolled "+nr1.roll()+" Score: "+nr1.getScore());
      System.out.println(nr2.getName()+" rolled "+nr2.roll()+" Score: "+nr2.getScore());

    }
    if(nr1.getScore()==1){
      System.out.println(nr1.getName()+" wins");
    }else{
      System.out.println(nr2.getName()+" wins");
    }
  }
}
