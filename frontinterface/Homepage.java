package frontinterface;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Homepage extends Scene {

    private static Pane mainPane = new Pane();
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public Homepage() {

        super(mainPane, WIDTH, HEIGHT);

        Text mainText = new Text(WIDTH/2, HEIGHT/2, "Welcome to Toys Rent");
        Text subText = new Text(WIDTH/2, HEIGHT/2 + 5, "Login as:");

        mainPane.getChildren().addAll(mainText, subText);
    }
}
