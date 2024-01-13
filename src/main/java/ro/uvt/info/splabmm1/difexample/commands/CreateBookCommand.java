package ro.uvt.info.splabmm1.difexample.commands;

import ro.uvt.info.splabmm1.model.Book;

import java.util.HashMap;

public class CreateBookCommand implements Command{
    private final String title;
    private final HashMap<Long, Book> bookHashMap;
    private final Long bookId;

    public CreateBookCommand(String title, Long bookId, HashMap<Long, Book> bookHashMap) {
        this.title = title;
        this.bookId = bookId;
        this.bookHashMap = bookHashMap;
    }

    @Override
    public Book execute() {
        Book book = new Book(title);
        book.setTitle(title);
        book.setId(bookId);
        bookHashMap.put(bookId, book);
        return book;
    }
}