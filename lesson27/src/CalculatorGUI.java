import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CalculatorGUI extends Application
{
  private Button Button7;
  private Button Button4;
  private Button Button1;
  private Button Button0;

  private Button Button8;
  private Button Button5;
  private Button Button2;
  private Button ButtonDot;

  private Button Button9;
  private Button Button6;
  private Button Button3;
  private Button ButtonEquals;

  private Button ButtonDivision;
  private Button ButtonMultiplication;
  private Button ButtonSubtract;
  private Button ButtonAdd;

  private VBox firstRow;
  private VBox secondRow;
  private VBox thirdRow;
  private VBox forthRow;

  private HBox mainPlane;
  private HBox firstBox;
  private VBox mainPlaneAll;

  private TextField field;
  private Button buttonClear;
  private Scene scene;
  int ButtonSize = 60;
  private ListenerButtons buttonListener;
  byte operand =-1; // 1 adition 2 supbtraction 3 multiplication 4 division 5 equals
  int firstNr;
  int secondNr;
  int result;

  public void start(Stage window)
  {
    window.setTitle("Calculator");
    buttonClear = new Button("CLEAR");

    buttonListener = new ListenerButtons();

    Button7 = new Button("7");
    Button7.setPrefSize(ButtonSize,ButtonSize);
    Button4 = new Button("4");
    Button4.setPrefSize(ButtonSize,ButtonSize);
    Button1 = new Button("1");
    Button1.setPrefSize(ButtonSize,ButtonSize);
    Button0 = new Button("0");
    Button0.setPrefSize(ButtonSize,ButtonSize);

    Button8 = new Button("8");
    Button8.setPrefSize(ButtonSize,ButtonSize);
    Button5 = new Button("5");
    Button5.setPrefSize(ButtonSize,ButtonSize);
    Button2 = new Button("2");
    Button2.setPrefSize(ButtonSize,ButtonSize);
    ButtonDot = new Button(".");
    ButtonDot.setPrefSize(ButtonSize,ButtonSize);

    Button9 = new Button("9");
    Button9.setPrefSize(ButtonSize,ButtonSize);
    Button6 = new Button("6");
    Button6.setPrefSize(ButtonSize,ButtonSize);
    Button3 = new Button("3");
    Button3.setPrefSize(ButtonSize,ButtonSize);
    ButtonEquals = new Button("=");
    ButtonEquals.setPrefSize(ButtonSize,ButtonSize);

    ButtonDivision = new Button("/");
    ButtonDivision.setPrefSize(ButtonSize,ButtonSize);
    ButtonMultiplication = new Button("*");
    ButtonMultiplication.setPrefSize(ButtonSize,ButtonSize);
    ButtonSubtract = new Button("-");
    ButtonSubtract.setPrefSize(ButtonSize,ButtonSize);
    ButtonAdd = new Button("+");
    ButtonAdd.setPrefSize(ButtonSize,ButtonSize);

    firstRow = new VBox();
    secondRow = new VBox();
    thirdRow = new VBox();
    forthRow = new VBox();

    Button0.setOnAction(buttonListener);
    buttonClear.setOnAction(buttonListener);
    Button1.setOnAction(buttonListener);
    Button2.setOnAction(buttonListener);
    Button3.setOnAction(buttonListener);
    Button4.setOnAction(buttonListener);
    Button5.setOnAction(buttonListener);
    Button6.setOnAction(buttonListener);
    Button7.setOnAction(buttonListener);
    Button8.setOnAction(buttonListener);
    Button9.setOnAction(buttonListener);
    ButtonMultiplication.setOnAction(buttonListener);
    ButtonEquals.setOnAction(buttonListener);
    ButtonDivision.setOnAction(buttonListener);
    ButtonAdd.setOnAction(buttonListener);
    ButtonSubtract.setOnAction(buttonListener);

    firstRow.getChildren().add(Button7);
    firstRow.getChildren().add(Button4);
    firstRow.getChildren().add(Button1);
    firstRow.getChildren().add(Button0);

    secondRow.getChildren().add(Button8);
    secondRow.getChildren().add(Button5);
    secondRow.getChildren().add(Button2);
    secondRow.getChildren().add(ButtonDot);

    thirdRow.getChildren().add(Button9);
    thirdRow.getChildren().add(Button6);
    thirdRow.getChildren().add(Button3);
    thirdRow.getChildren().add(ButtonEquals);

    forthRow.getChildren().add(ButtonDivision);
    forthRow.getChildren().add(ButtonMultiplication);
    forthRow.getChildren().add(ButtonSubtract);
    forthRow.getChildren().add(ButtonAdd);

    mainPlane = new HBox();
    mainPlane.getChildren().add(firstRow);
    mainPlane.getChildren().add(secondRow);
    mainPlane.getChildren().add(thirdRow);
    mainPlane.getChildren().add(forthRow);

    field = new TextField();
    field.setText("0");
    firstBox = new HBox();
    buttonClear.setPrefSize(ButtonSize,ButtonSize);
    field.setPrefSize(ButtonSize*3,ButtonSize);
    firstBox.getChildren().add(field);
    firstBox.getChildren().add(buttonClear);
    mainPlaneAll = new VBox();
    mainPlaneAll.getChildren().add(firstBox);
    mainPlaneAll.getChildren().add(mainPlane);

    scene = new Scene(mainPlaneAll);

    window.setScene(scene);
    window.show();
  }

  private class ListenerButtons implements EventHandler<ActionEvent>
  {
    @Override public void handle(ActionEvent actionEvent)
    {
      String input = field.getText();
      if(input.equals("0"))
      {
        field.setText("");
      }
      if(actionEvent.getSource() == buttonClear)
      {
        field.setText("0");
        operand=-1;
      }
      if(actionEvent.getSource() == Button0)
      {
        String temp = field.getText();
        if(Integer.parseInt(temp.trim())!=0){
          temp+="0";
          field.setText(temp);
        }
      }
      if(actionEvent.getSource() == Button1)
      {
        String temp = field.getText();
          temp+="1";
          field.setText(temp);
      }
      if(actionEvent.getSource() == Button2)
      {
        String temp = field.getText();
        temp+="2";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button3)
      {
        String temp = field.getText();
        temp+="3";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button4)
      {
        String temp = field.getText();
        temp+="4";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button5)
      {
        String temp = field.getText();
        temp+="5";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button6)
      {
        String temp = field.getText();
        temp+="6";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button7)
      {
        String temp = field.getText();
        temp+="7";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button8)
      {
        String temp = field.getText();
        temp+="8";
        field.setText(temp);
      }
      if(actionEvent.getSource() == Button9)
      {
        String temp = field.getText();
        temp+="9";
        field.setText(temp);
      }
      if(actionEvent.getSource() == ButtonAdd)
      {
        String temp = field.getText();
        operand = 1;
        if(!temp.equals(""))
        {
          firstNr = Integer.parseInt(temp.trim());
          field.setText("0");
        }
      }
      if(actionEvent.getSource() == ButtonSubtract)
      {
        String temp = field.getText();
        operand = 2;
        if(!temp.equals(""))
        {
          firstNr = Integer.parseInt(temp.trim());
          field.setText("0");
        }
      }
      if(actionEvent.getSource() == ButtonMultiplication)
      {
        String temp = field.getText();
        operand = 3;
        if(!temp.equals(""))
        {
          firstNr = Integer.parseInt(temp.trim());
          field.setText("0");
        }
      }
      if(actionEvent.getSource() == ButtonDivision)
      {
        String temp = field.getText();
        operand = 4;
        if(!temp.equals(""))
        {
          firstNr = Integer.parseInt(temp.trim());
          field.setText("0");
        }
      }
      if(actionEvent.getSource() == ButtonEquals)
      {
        String temp = field.getText();
        if(!temp.equals("")&&!temp.contains("."))
        {
          secondNr = Integer.parseInt(temp.trim());
        }
        if(operand==1)
        {
          result = firstNr+secondNr;
        }
        else if (operand==2)
        {
          result = firstNr-secondNr;
        }
        else if (operand==3)
        {
          result = firstNr*secondNr;
        }
        else if (operand==4)
        {
          double resultLong = (firstNr*1.0)/secondNr;
          field.setText(""+resultLong);
        }
        else if (operand==-1)
        {
          result =0;
        }
        if(operand!=4)
        {
          field.setText(""+result);
        }
        operand=5;

      }
      System.out.println("nr1:" +firstNr+" nr2: "+secondNr+" operation:"+ operand);
    }
  }

}
