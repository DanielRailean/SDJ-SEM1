import javax.swing.*;

public class WindowEmbeddedMain extends JFrame
{
  public WindowEmbeddedMain(){
    super("Embedded main test");
    int width = 300;
    int height =200;
    setSize(width,height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args)
  {
    WindowEmbeddedMain window1 = new WindowEmbeddedMain();
     new WindowEmbeddedMain();
  }
}
