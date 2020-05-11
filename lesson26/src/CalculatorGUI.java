import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Field;

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
  private VBox mainPlaneAll;

  private TextField field;
  private Scene scene;
  int ButtonSize = 80;

  public void start(Stage window)
  {
    window.setTitle("Calculator");

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
    field.setPrefSize(ButtonSize*4,ButtonSize);
    mainPlaneAll = new VBox();
    mainPlaneAll.getChildren().add(field);
    mainPlaneAll.getChildren().add(mainPlane);

    scene = new Scene(mainPlaneAll);

    window.setScene(scene);
    window.show();
  }

}
