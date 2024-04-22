package homework;

public class Product {
    private String type;
    private double cost;
    private String name;

    public Product() {
        super();
    }

    public Product(String type, double cost, String name) {
        this.type = type;
        this.cost = cost;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
