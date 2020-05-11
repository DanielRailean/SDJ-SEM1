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

public class FirstEx extends Application
{
  private Scene scene;
  private VBox verticalBoxCheck;
  private VBox verticalBoxInput;
  private VBox verticalBoxButtons;
  private VBox verticalBoxLabel;
  private HBox horisontalBoxes;
  private Button OKButton;
  private Button cancelButton;
  private Button clearButton;
  private Label Xlabel;
  private Label Ylabel;
  private CheckBox exitOnOk;
  private CheckBox exitOnCancel;
  private TextField Xfield;
  private TextField Yfield;
  int buttonSize = 80;
  int fieldSize = 70;

  public void start(Stage window)
  {
    window.setTitle("Align");

    exitOnOk = new CheckBox("Exit on OK");
    exitOnCancel = new CheckBox("Exit on Cancel");
    Xlabel = new Label("X:");
    Ylabel  = new Label("Y:");
    Xfield = new TextField();
    Yfield = new TextField();
    Xfield.setPrefWidth(fieldSize);
    Yfield.setPrefWidth(fieldSize);
    OKButton = new Button("OK");
    cancelButton = new Button("Cancel");
    clearButton = new Button("Clear");
    OKButton.setPrefWidth(buttonSize);
    cancelButton.setPrefWidth(buttonSize);
    clearButton.setPrefWidth(buttonSize);

    verticalBoxCheck = new VBox();
    verticalBoxCheck.getChildren().add(exitOnOk);
    verticalBoxCheck.getChildren().add(exitOnCancel);
    verticalBoxCheck.setSpacing(20);
    verticalBoxCheck.setPadding(new Insets(20));

    verticalBoxLabel = new VBox();
    verticalBoxLabel.getChildren().add(Xlabel);
    verticalBoxLabel.getChildren().add(Ylabel);
    verticalBoxLabel.setSpacing(20);
    verticalBoxLabel.setPadding(new Insets(20,0,0,5));

    verticalBoxInput = new VBox();
    verticalBoxInput.getChildren().add(Xfield);
    verticalBoxInput.getChildren().add(Yfield);
    verticalBoxInput.setSpacing(20);
    verticalBoxInput.setPadding(new Insets(10,5,0,0));

    verticalBoxButtons = new VBox();
    verticalBoxButtons.getChildren().add(OKButton);
    verticalBoxButtons.getChildren().add(cancelButton);
    verticalBoxButtons.getChildren().add(clearButton);
    verticalBoxButtons.setSpacing(5);
    verticalBoxButtons.setPadding(new Insets(2));

    horisontalBoxes = new HBox();
    horisontalBoxes.getChildren().add(verticalBoxCheck);
    horisontalBoxes.getChildren().add(verticalBoxLabel);
    horisontalBoxes.getChildren().add(verticalBoxInput);
    horisontalBoxes.getChildren().add(verticalBoxButtons);
    horisontalBoxes.setSpacing(5);

    scene = new Scene(horisontalBoxes);

    window.setScene(scene);
    window.show();
  }
}
