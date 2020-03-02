import javax.swing.*;

public class SimpleWindow
{
  public static void main(String[] args)
  {
    final int WINDOW_W = 360,
              WINDOW_H = 250;
    JFrame window = new JFrame("Simple Window Class");

    window.setSize(WINDOW_W,WINDOW_H);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

  }
}
