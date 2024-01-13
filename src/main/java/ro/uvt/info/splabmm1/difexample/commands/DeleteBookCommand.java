package ro.uvt.info.splabmm1.difexample.commands;

import ro.uvt.info.splabmm1.model.Book;

import java.util.HashMap;

public class DeleteBookCommand implements Command{
    private final Long bookId;
    private final HashMap<Long, Book> bookHashMap;

    public DeleteBookCommand(Long bookId, HashMap<Long, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
        this.bookId = bookId;
    }

    @Override
    public String execute() {
        this.bookHashMap.remove(this.bookId);
        return "Book deleted successfully!";
    }
}