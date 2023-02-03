package CourseOne.homeworkTwelve;

import java.util.Objects;

public class Book {
    private String titleName;
    private int year;
    Author author;

    public Book(String titleName, int year, Author author) {
        this.titleName = titleName;
        this.year = year;
        this.author = author;
    }
    public String getTitleName() {
        return this.titleName;
    }
    public int getYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String setTitleName(String titleName) {
       return this.titleName = titleName;
    }
    public int setYear(int year) {
        return this.year = year;
    }
    public Author setAuthor(Author author) {
        return this.author = author;
    }

    @Override
    public String toString() {
            return  this.titleName + ", Год публикации - " + this.year + ", " + author;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || !o.getClass().equals(Book.class)) return false;
        Book book = (Book) o;
        return this.year == book.year && Objects.equals(this.titleName, book.titleName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleName, year, author);
    }
}
