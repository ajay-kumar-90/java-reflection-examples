package jsonwriter.data;

public class Movie {
    private final String name;
    private final float rating;
    private final String[] categories;
    private final Actor[] actors;

    public Movie(String name, float rating, String[] categories, Actor[] actors) {
        this.name = name;
        this.rating = rating;
        this.categories = categories;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public String[] getCategories() {
        return categories;
    }

    public Actor[] getActors() {
        return actors;
    }
}
