import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99); //put inputs he put
        Book book2 = new Book("crème waffles for dummies", "Piro Lane", 24.79);

        SLList<Book> booksList = new SLList<>();

        booksList.listAdd(book1);
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);
        System.out.println(booksList.toString());

        booksList.listRemove(1);
        System.out.println(booksList.toString());
    }
}