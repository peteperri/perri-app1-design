/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private String title;
    private ArrayList<Item> itemList;

    //toDoList constructor
    public ToDoList(String title, List<Item> itemList){
        if(validateTitle(title)){
            this.title = title;
        }
        if(validateToDoList(itemList)){
            this.itemList = (ArrayList<Item>) itemList;
        }
    }

    public boolean validateToDoList(List<Item> itemList){
        //verify that the toDoList does not have more than 256 items
        return true;
    }
    public boolean validateTitle(String title){
        //method verifies that the title is at least 3 chars long
        return true;
    }

    public void addItemToList(Item item){

        //add an item to the list using the ArrayList's add method
    }

    public void removeItemFromList(Item item){

        //remove an item from the list using the ArrayList's remove method
    }

}
