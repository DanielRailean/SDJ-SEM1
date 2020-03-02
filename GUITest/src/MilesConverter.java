import javax.swing.*;
import java.awt.event.*;

public class MilesConverter extends JFrame
{
  private JPanel panel;
  private JLabel messageLabel;
  private JLabel responseLabel;
  private JTextField kiloTextField;
  private JButton calcButton;
  private int windowHeight = 210;
  private int windowWidth = 300;

  public MilesConverter()
  {
    super("Miles to kilometer converter");

    setSize(windowWidth, windowHeight);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buildPanel();
    add(panel);
    setVisible(true);
  }

  private void buildPanel()
  {
    messageLabel = new JLabel("Enter a distance \nin miles");
    kiloTextField = new JTextField(10);
    calcButton = new JButton("Calculate");
    responseLabel = new JLabel("In km");
    calcButton.addActionListener(new CalcButtonListener());

    panel = new JPanel();

    panel.add(messageLabel);
    panel.add(kiloTextField);
    panel.add(calcButton);
    panel.add(responseLabel);
  }

  private class CalcButtonListener implements ActionListener
  {
    double kilom;
    public void actionPerformed(ActionEvent e){
      double conversion = 1.609344;
      String input = kiloTextField.getText();
      kilom = Double.parseDouble(input) * conversion;
      responseLabel.setText("\nIn kilom: "+kilom);
    }
  }

  public static void main(String[] args)
  {
    new MilesConverter();
  }
}
