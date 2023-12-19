package ro.uvt.info.splabmm1.service;
import ro.uvt.info.splabmm1.model.Book;

public class GetBookById implements Command<Book> {

    @Override
    public Book execute() {
        return new Book("Alt exemplu");
    }
}