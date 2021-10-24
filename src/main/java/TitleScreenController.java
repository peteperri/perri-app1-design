/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class TitleScreenController {

    @FXML private Button createNewListButton;
    @FXML private Button viewListButton;
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML void newListButtonClicked(ActionEvent event) throws IOException {
        //when the New List Button is clicked, open up the List Editor screen
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CreateListScreen.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML void viewListButtonClicked(ActionEvent event) throws IOException {
        //when the View Lists button is clicked, open up the View All Lists screen
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ViewListsScreen.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
