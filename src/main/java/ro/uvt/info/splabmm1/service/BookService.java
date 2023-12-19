package ro.uvt.info.splabmm1.service;


import org.springframework.stereotype.Component;
import ro.uvt.info.splabmm1.model.Book;
@Component
public class BookService {

    public Book saveBook(Book newBook) {
        System.out.println("Salvam cartea");
        return newBook;
    }
}