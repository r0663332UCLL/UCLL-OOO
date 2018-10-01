package view;

import domain.shop;

import javax.swing.*;

public class shopapp {

    public static void main(String[] args) {
        shop shop = new shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                String title = JOptionPane.showInputDialog("Enter the title:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
                String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
                shop.addProduct(title, type, id);

            } else if (choice == 2) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
                shop.showProduct(id);

            } else if (choice == 3){
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
                String daysString = JOptionPane.showInputDialog("Enter the number of days:");
                shop.showPrice(id, daysString);
            }
        }
    }
}
