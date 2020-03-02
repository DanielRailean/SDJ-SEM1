import javax.swing.JOptionPane;

public class gui
{
  public static void main(String[] args)
  {
    int score1,score2;
    String userInput;
    double average;
    int repeat;
    do{
      userInput = JOptionPane.showInputDialog(null,"Enter score NO1");
      score1 = Integer.parseInt(userInput);
      userInput = JOptionPane.showInputDialog(null,"Enter score NO2");
      score2 = Integer.parseInt(userInput);
      average = (score1+score2)/ 3.0;
      JOptionPane.showMessageDialog(null,"The avegare is "+average);
      repeat = JOptionPane.showConfirmDialog(null,"Another set?","Please confirm",JOptionPane.YES_NO_OPTION);
    }while (repeat == JOptionPane.YES_OPTION);
    System.exit(0);
  }
}
