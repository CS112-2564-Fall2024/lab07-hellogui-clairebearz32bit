package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables
    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    // TODO: follow steps 2-9 in README.md to create a start method
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hell GUI: Claire");
        StackPane layout = new StackPane();

        Label label = new Label("Hello GUI World");
        Label l2 = new Label("Label 2");
        Label l3 = new Label("Label 3");

        AnchorPane.setBottomAnchor(label,0.0);
        AnchorPane.setRightAnchor(label,0.0);

        layout.getChildren().add(label);
        layout.getChildren().add(l2);
        layout.getChildren().add(l3);


        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);



        stage.show();
    }
    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
}