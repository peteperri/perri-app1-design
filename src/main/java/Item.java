/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */
public class Item {

    private String itemName;
    private String description;
    private String dueDate;
    private boolean completed;

    //constructor for if the user only enters an item name
    public Item(String itemName){
        this.itemName = itemName;
        description = "";
        dueDate = "";
        completed = false;
    }

    //constructor for if the user enters all fields but does not specify if the item is done
    public Item(String itemName, String description, String dueDate){
        this.itemName = itemName;
        this.description = description;
        if(validateDueDate(dueDate)){
            this.dueDate = dueDate;
        }
        completed = false;
    }

    //constructor for if the user does not enter all fields but specifies if the item is done
    public Item(String itemName, boolean completed){
        this.itemName = itemName;
        this.description = "";
        this.dueDate = "";
        this.completed = completed;
    }

    //constructor for if the user enters all fields including item completion status
    public Item(String itemName, String description, String dueDate, boolean completed){
        this.itemName =itemName;
        this.description = description;
        if(validateDueDate(dueDate)){
            this.dueDate = dueDate;
        }
        this.completed = completed;
    }

    public String toString(){
        String str = null;
        //str will be a String that contains all the information about an item
        return str;
    }

    private boolean validateDueDate(String dueDate) {
        //String validation method to verify that dueDates
        //are formatted as YYYY-MM-DD
        return true;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setDueDate(String dueDate){
        if(validateDueDate(dueDate)){
            this.dueDate = dueDate;
        }
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
