package business_logic;

public class Product {

    private int id;
    private String title;
    private double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String getInfo() {
        return  " id: " + this.id +
                ", title: " + this.title +
                ", cost: " + this.cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
