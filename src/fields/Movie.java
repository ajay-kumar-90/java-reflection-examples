package fields;

public class Movie extends Product {

    private static final double MINIMUM_PRICE = 10.99;
    private boolean isReleased;
    private Category category;
    private double actualPrice;

    public Movie(String name, int year, boolean isReleased, Category category, double price) {
        super(name, year);
        this.isReleased = isReleased;
        this.category = category;
        this.actualPrice = Math.max(price, MINIMUM_PRICE);
    }

    public static double getMinimumPrice() {
        return MINIMUM_PRICE;
    }

    public boolean isReleased() {
        return isReleased;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public double getActualPrice() {
        return actualPrice;
    }

    public class MovieStats {
        double timesWatched;

        public MovieStats(double timesWatched) {
            this.timesWatched = timesWatched;
        }

        public double getRevenue() {
            return timesWatched * timesWatched;
        }
    }
}
