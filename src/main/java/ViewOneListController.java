/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ViewOneListController {

    @FXML private Button backToListsButton;
    @FXML private Button editListButton;
    @FXML private Button exportButton;
    @FXML private Label listNameLabel;
    @FXML private Button markDoneButton;
    @FXML private ListView<Item> singleListViewer;
    @FXML private Button viewDoneButton;
    @FXML private Button viewNotDoneButton;

    @FXML void backToListsButtonClicked(ActionEvent event) {
        //return the user to the screen that lets them view all of their toDoLists
    }

    @FXML void editListButtonClicked(ActionEvent event) {
        //open up the list the user is viewing in the list editor
    }

    @FXML void exportButtonClicked(ActionEvent event) {
        //create a file based on the list the user is viewing
        //open a Windows explorer dialogue box to select where the user wants to save the list
    }

    @FXML void markDoneButtonClicked(ActionEvent event) {
        //mark the selected item in the list as completed
    }

    @FXML void viewDoneButtonClicked(ActionEvent event) {
        //hide all list entries that are not completed
    }

    @FXML void viewNotDoneButtonClicked(ActionEvent event) {
        //hide all list entries that are completed
    }

}
