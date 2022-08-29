package lesson_10;

import java.sql.SQLOutput;

public class Reader {
    String name;
    int age;
    char sex;

    public Reader(String name,int age,char sex){
        this.sex = sex;
        this.name = name;
        this.age = age;
    }
    void getRead(Book book, Reader read) {
        System.out.println("Reader : " + this.name + " " + this.age + " " + this.sex);
        System.out.println("Book Information");
        System.out.println("************************");
        System.out.println("Title : " + book.title);
        System.out.println("Type : " + book.type);
        System.out.println("HardCover : " + book.isHardCover);
        System.out.println("Page : " + book.page);
        System.out.println("Author : " + book.author.name);
        System.out.println("Reader's Current Page : " + book.currentPage);
        if (book.currentPage <= 250 && book.currentPage >= 0) {
            System.out.println("Reading Continues...");
        } else {
            System.out.println("Finished Reading the Book.");
        }
    }

    void setRead(Book book, int currentPage) {
        book.currentPage = currentPage;
    }
}
