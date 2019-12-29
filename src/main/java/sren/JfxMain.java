package sren;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JfxMain extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    VBox root = new VBox();
    createViewContent(root);

    primaryStage.setScene(new Scene(root, 420, 420));
    primaryStage.show();
  }

  private void createViewContent(VBox root){
    var dtp = new DateAndTimePicker();
    var label1 = new Label("");
    var label2 = new Label("");

    label1.textProperty().bind(dtp.valueProperty().asString());

   root.getChildren().add(dtp);
   root.getChildren().add(label1);
  }
}
