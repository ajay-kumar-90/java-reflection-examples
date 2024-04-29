package fields;

public class Product {
    private final String name;
    private final int year;
    private double actualPrice;

    public Product(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getActualPrice() {
        return actualPrice;
    }
}
