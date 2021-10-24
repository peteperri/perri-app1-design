/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //set up the stage, load fxml files, and set the title of the window
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TitleScreen.fxml")));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Title Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        //launch the application
        launch(args);
    }
}
