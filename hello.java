import javafx.event.EventHandler;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hello extends Application {
    public void start(Stage primaryStage) {
        // Create a button
        Button obj = new Button();
        obj.setText("Say Hello End USER");

        // Set an event handler for the button using an anonymous inner class
        obj.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello User!");
            }
        });

        // Create a StackPane and add the button to it
        StackPane obj_root = new StackPane();
        obj_root.getChildren().add(obj);

        // Create a Scene with the StackPane as its root and set its dimensions
        Scene obj_Scene = new Scene(obj_root, 300, 250);

        // Set the title and scene for the primary stage (main window)
        primaryStage.setTitle("Hello End User!");
        primaryStage.setScene(obj_Scene);

        // Display the primary stage
        primaryStage.show();
    }

    // The main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
