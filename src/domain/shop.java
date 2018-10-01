package domain;

import javax.swing.*;
import domain.*;

import java.util.ArrayList;

public class shop {

    private ArrayList<product> producten;

    public shop() {
        this.producten = new ArrayList<product>();
    }

    public void addProduct(String title, String type, int id){
        if (type.equals("M")){

            product product = new movie(title, type, id);
            producten.add(product);

        } else if (type.equals("G")) {

            product product = new game(title, type, id);
            producten.add(product);

        }
    }

    public void showProduct(int id){
        boolean found = false;
        for(product product : producten){
            if(product.getId() == id){
                JOptionPane.showMessageDialog(null, product.getTitle());
            }
        }
    }

    public void showPrice(int id, String daysString){
        for(product product : producten){
            if(product.getId() == id){
                int days = Integer.parseInt(daysString);
                JOptionPane.showMessageDialog(null, product.getPrice(days));
            }
        }
    }
}
