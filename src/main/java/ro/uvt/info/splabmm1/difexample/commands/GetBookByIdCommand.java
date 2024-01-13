package ro.uvt.info.splabmm1.difexample.commands;

import ro.uvt.info.splabmm1.model.Book;

import java.util.HashMap;

public class GetBookByIdCommand implements Command{
    private final Long bookId;
    private final HashMap<Long, Book> bookHashMap;

    public GetBookByIdCommand(Long bookId, HashMap<Long, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
        this.bookId = bookId;
    }

    @Override
    public Book execute() {
        return this.bookHashMap.get(bookId);
    }

}