package lesson_10;

public class ReaderTest {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Numan Yaman",27,'M');
        Author author1 = new Author("Malcolm Gladwell");
        Book book1 = new Book("Outliners",250,"Finction",true,0,author1);

        reader1.getRead(book1,reader1);
        System.out.println();
        reader1.setRead(book1,50);
        reader1.getRead(book1,reader1);
        System.out.println();
        reader1.setRead(book1,255);
        reader1.getRead(book1,reader1);
    }
}
