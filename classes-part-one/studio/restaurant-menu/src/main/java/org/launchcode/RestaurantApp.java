package org.launchcode;


import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class RestaurantApp {
    public static void main(String[] args) {
	// write your code here
    MenuItem menuItem1 = new MenuItem("Veggie Pizza", "Freshly hand toasted pizza with cheese and vegetables", "Appetizer",19.99, false);
    MenuItem menuItem2 = new MenuItem("Grilled Chicken", "organic chicken marinated with spices and grilled on charcoal","Main course", 22.99, true);
    MenuItem menuItem3 = new MenuItem("Carrot Cake","A moist, sweet spice cake that contain grated carrots, toasted nuts, and cream cheese frosting.","Dessert", 16.99, false);
    ArrayList<MenuItem> menuItems = new ArrayList<>();

   /* menuItems.add(menuItem1);
    menuItems.add(menuItem2);
    menuItems.add(menuItem3);*/

    Menu menu = new Menu( menuItems, LocalDate.now());
    menu.addItem(menuItem1);
    menu.displayMenu(menu.getItems());
    }
}
