package ro.uvt.info.splabmm1.service;

import ro.uvt.info.splabmm1.model.Book;

public class PostBook implements  Command<Book>{

    private final Book newBook;
    private final BookService bookService;

    public PostBook(Book newBook, BookService bookService) {
        this.newBook = newBook;
        this.bookService = bookService;
    }
    @Override
    public Book execute() {
        return this.bookService.saveBook(this.newBook);
    }
}
