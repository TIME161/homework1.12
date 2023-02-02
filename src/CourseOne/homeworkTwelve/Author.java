package CourseOne.homeworkTwelve;

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
}