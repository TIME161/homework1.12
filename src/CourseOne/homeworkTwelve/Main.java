package CourseOne.homeworkTwelve;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Austen");
        Author author2 = new Author("George", "Orwell");
        Author author3 = new Author("Jane", "Austen");

        Book book1 = new Book("Гордость и предубеждение", 1813, author1);
        Book book2 = new Book("1984", 1949, author2);
        Book book3 = new Book("Гордость и предубеждение", 1813, author1);

        System.out.println("==========================================");
        System.out.println(book1.getTitleName() + " " + book1.getYear() + " " + book1.getAuthor());
        System.out.println(book2.getTitleName() + " " + book2.getYear() + " " + book2.getAuthor());
        System.out.println(book3.getTitleName() + " " + book3.getYear() + " " + book3.getAuthor());
        System.out.println("==========================================");
        System.out.println(book2);
        book2.setYear(1984);
        System.out.println(book2);
        System.out.println("==========================================");
        System.out.println(author1);
        System.out.println(book1);
        System.out.println("==========================================");
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());
        System.out.println("==========================================");
        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println("==========================================");
        System.out.println(book1.hashCode() == book1.hashCode());
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.hashCode() == book3.hashCode());
        System.out.println("==========================================");
    }
}