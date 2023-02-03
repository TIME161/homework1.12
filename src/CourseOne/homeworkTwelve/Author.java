package CourseOne.homeworkTwelve;

import java.util.Objects;

public class Author {
    private String name;
    private String surName;

    public String toString() {
        return "Автор - " + name + " " + surName;
    }
    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public String getName(){
        return this.name;}
    public String getSurName(){
        return this.surName;}
    public String setName(String name) {
        return this.name = name;}
    public String setSurName(String surName) {
        return this.name = surName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !o.getClass().equals(Author.class)) return false;
        Author aut = (Author) o;
        return Objects.equals(this.name, aut.name) && Objects.equals(this.surName, aut.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surName);
    }
}