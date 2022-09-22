package dtos;

import java.util.List;

public class Viewer {
    private String name;
    private int age;
    private int countMovie;
    private List<Cinema> cinemas;

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

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public Viewer setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
        countMovie = cinemas.size();
        return this;
    }
}
