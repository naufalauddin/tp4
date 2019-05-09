package frontinterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;

public abstract class ChangeSceneHandler implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public ChangeSceneHandler(Stage stage) {
        this.primaryStage = stage;
    }

    public Stage getPrimaryStage() {
        return this.primaryStage;
    }

    public void changeScene(Scene scene) {
        this.primaryStage.setScene(scene);
    }

    public void changeTitle(String title) {
        this.primaryStage.setTitle(title);
    }
}
