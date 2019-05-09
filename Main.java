import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import frontinterface.Homepage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Home Page");
        primaryStage.setScene(new Homepage());
        primaryStage.show();
    }

    public static void main(String[] args) {
         Application.launch(args);
    }
 }
