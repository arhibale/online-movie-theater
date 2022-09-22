package dtos;

public class Cinema {
    private String name;
    private String genre;
    private int movieLength;

    public String getName() {
        return name;
    }

    public Cinema setName(String name) {
        this.name = name;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Cinema setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public Cinema setMovieLength(int movieLength) {
        this.movieLength = movieLength;
        return this;
    }
}
