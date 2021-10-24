/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class ListEditorController {

    @FXML private Button addItemButton;
    @FXML private TextField taskField;
    @FXML private TextField descriptionField;
    @FXML private TextField dueDateField;
    @FXML private CheckBox doneCheckBox;
    @FXML private Button editItemButton;
    @FXML private ListView<?> editorListDisplay;
    @FXML private Button importButton;
    @FXML private Button listNameButton;
    @FXML private TextField listNameField;
    @FXML private Text listNameLabel;
    @FXML private Button mainMenuButton;
    @FXML private Button removeItemButton;
    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML void addItemButtonClicked(ActionEvent event) {
        //when the Add Item Button is clicked, create a new Item
        //based on the user's entries in the taskField, dueDateField,
        //descriptionField, and doneCheckBox.
        //If there is no existing To Do List yet, create it. If there
        //is an existing list, add this item to the list.

        //if this button's text says "update item", update the item instead of
        //creating a new one, then set the items
    }

    @FXML void doneCheckBoxChecked(ActionEvent event) {
        //set boolean checkBoxChecked to true
    }

    @FXML void editItemButtonClicked(ActionEvent event) {
        //if an item in the listView is selected:
        //populate the taskField, dueDateField, descriptionField, and
        //doneCheckBox with the data that the item has. This will allow
        //the user to edit an existing item. This will also change the addItemButton's
        //text to "Update item".

        //if an item is not selected, then  tell the user they can't
        //edit nothing

    }

    @FXML void importButtonClicked(ActionEvent event) {
        //open up a file explorer window. if the user selects a file
        //recognized by the program, make a toDoList or multiple based on the file.
        //if not, show an error message
    }

    @FXML void mainMenuButtonClicked(ActionEvent event) throws IOException {
        //return to the title screen
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TitleScreen.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void removeItemButtonClicked(ActionEvent event) {
        //remove the selected item from the list
    }

}
