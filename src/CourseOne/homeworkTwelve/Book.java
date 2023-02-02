package CourseOne.homeworkTwelve;
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
}
