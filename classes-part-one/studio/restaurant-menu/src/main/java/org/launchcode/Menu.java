package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem>  items;
    private LocalDate lastUpdated;

    public Menu(ArrayList<MenuItem> items, LocalDate lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        updateLastUpdated(); // Update the lastUpdated date when adding an item
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        updateLastUpdated(); // Update the lastUpdated date when removing an item
    }

    private void updateLastUpdated() {
        this.lastUpdated = LocalDate.now(); // Update lastUpdated date to current date/time
    }

    public void displayMenu(ArrayList<MenuItem> items) {
        for( Object o : items){
            System.out.println(o);
            System.out.println("lastUpdated=" + lastUpdated );
        }
    }
}
