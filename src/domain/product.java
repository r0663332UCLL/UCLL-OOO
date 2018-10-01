package domain;

public abstract class product implements price{

    private String title, type;
    private int id;

    public product(String title, String type, int id) {
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int days);
}
