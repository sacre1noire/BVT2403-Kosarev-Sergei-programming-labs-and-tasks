package Lab_6.Task_3;

public class SoldItem {
    private String name;
    private double price;

    public SoldItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Цена: " + price + ")";
    }
}