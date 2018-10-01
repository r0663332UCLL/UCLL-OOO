package domain;

public class movie extends product {

    public movie(String title, String type, int id) {
        super(title, type, id);
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
