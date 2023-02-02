package CourseOne.homeworkTwelve;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Austen");
        Author author2 = new Author("George", "Orwell");
        Book book1 = new Book("Гордость и предубеждение", 1813, author1);
        Book book2 = new Book("1984", 1949, author2);
        book2.setYear(1984);
        System.out.println("book2.getName() = " + book2.getTitleName());
        System.out.println("Книга - " + book1.getTitleName() + " " + book1.getYear() + " " + book1.getAuthor());
    }
}