package lesson_10;

public class Book {
    String title;
    int page;
    String type;
    boolean isHardCover;
    int currentPage;
    Author author;
    public Book(String title,int page,String type,boolean isHardCover,int currentPage,Author author) {
        this.currentPage = currentPage;
        this.author = author;
        this.page = page;
        this.isHardCover = isHardCover;
        this.title = title;
        this.type = type;

    }
}
