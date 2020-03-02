import javax.swing.*;

public class SimpleWindowInheritance extends JFrame
{
  public SimpleWindowInheritance(){
    super("SIMPLE WINDOW INHERITANCE TEST");
    int width = 500;
    int height = 700;
    setSize(width,height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
