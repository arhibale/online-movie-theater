package dtos;

public class Viewer {
    private String name;
    private int age;
    private int countMovie;

    public String getName() {
        return name;
    }

    public Viewer setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Viewer setAge(int age) {
        this.age = age;
        return this;
    }

    public int getCountMovie() {
        return countMovie;
    }

    public Viewer setCountMovie(int countMovie) {
        this.countMovie = countMovie;
        return this;
    }
}
