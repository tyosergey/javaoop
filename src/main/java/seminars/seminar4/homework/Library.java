package seminars.seminar4.homework;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> givenBooks;

    public void addBook(Book name){
        books.add(name);
    }

    public String giveBook(String name){
        for (Book book : books){
            if (book.equals(name)){
                System.out.println(book);
                givenBooks.add(book);
            }
        }
        return String.format("Книги с названием %s в библиотеке нет.", name);
    }

    public void getInfo(){
        System.out.println(givenBooks);
    }
}
