package domain;

public class game extends product {

    public game(String title, String type, int id) {
        super(title, type, id);
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        price = days * 3;
        return price;
    }
}