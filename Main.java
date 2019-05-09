import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import frontinterface.Homepage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Home Page");
        Scene homepage = new Homepage();
        primaryStage.setScene(homepage);

    }

    public static void main(String[] args) {
         Application.launch(args);
    }
}
