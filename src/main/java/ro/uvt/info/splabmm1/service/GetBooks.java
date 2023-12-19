package ro.uvt.info.splabmm1.service;

import ro.uvt.info.splabmm1.model.Book;

import java.util.List;

public class GetBooks implements Command<List<Book>> {

    @Override
    public List<Book> execute() {
        return List.of(new Book("Un exemplu"));
    }
}
