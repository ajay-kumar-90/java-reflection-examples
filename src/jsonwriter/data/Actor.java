package jsonwriter.data;

public class Actor {
    private final String name;
    private final String[] knownForMovies;

    public Actor(String name, String[] knownForMovies) {
        this.name = name;
        this.knownForMovies = knownForMovies;
    }

    public String getName() {
        return name;
    }

    public String[] getKnownForMovies() {
        return knownForMovies;
    }
}
