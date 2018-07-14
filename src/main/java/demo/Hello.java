package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            getChildren().addAll(new Button("Hello"), new Button("JavaFX"), new Button("VBox"));
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}