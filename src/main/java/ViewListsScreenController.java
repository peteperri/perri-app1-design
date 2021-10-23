/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class ViewListsScreenController {

    @FXML
    private Button addListButton;

    @FXML
    private Button backButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private Button editListButton;

    @FXML
    private Button exportListButton;

    @FXML
    private Label infoLabel;

    @FXML
    private ListView<ToDoList> viewAllLists;

    @FXML
    private Button viewListButton;


    @FXML
    void addListButtonClicked(ActionEvent event) {
        //open up the list editor so the user can make a new list
        //all fields empty
    }

    @FXML
    void backButtonClicked(ActionEvent event) {
        //go back to the title screen
    }

    @FXML
    void deleteListButtonClicked(ActionEvent event) {
        //remove the toDoList the user selected from the ListView. if they did not
        //select an item in the listView, give an error message.
    }

    @FXML
    void editListButtonClicked(ActionEvent event) {
        //open up the selected list in the list editor window.
        // if there is no list selected, give an error message

    }

    @FXML
    void exportListButtonClicked(ActionEvent event) {
        //create a file that contains the list or lists the user selected to export.
        //open up a file explorer window and allow the user to specify where the file is
        //saved

    }

    @FXML
    void viewListButtonClicked(ActionEvent event) {
        //open up the selected list in the screen that controls viewing one single list.
        //if the user selected multiple lists or no lists, don't open the window and give an error message.
    }

}
