import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void validateToDoList() {
        //create a new ToDoList object
        //attempt to give it a list larger than 256 items
        //assert that the list is not allowed to be less than 256 items
    }

    @Test
    void validateTitle() {
        //create a new ToDoList object
        //attempt to give it a name that is less than 3 characters long
        //assert that the title is not allowed to be less than three characters long
    }

    @Test
    void addItemToList() {
        //create a new ToDoList object
        //attempt to add an item to its ArrayList of items
        //assert that the actual list is equal to a hardcoded expected list both in length
        //and by looping through the contents of each
    }

    @Test
    void removeItemFromList() {
        //create a new ToDoList object
        //attempt to remove an item to its ArrayList of items
        //assert that the actual list is equal to a hardcoded expected list both in length
        //and by looping through the contents of each
    }
}