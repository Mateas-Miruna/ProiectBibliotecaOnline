package ro.uvt.info.splabmm1.difexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.splabmm1.difexample.persistence.BooksRepository;
import ro.uvt.info.splabmm1.model.Book;

import java.util.List;

@Service
public class BookService {

    private final BooksRepository booksRepository;

    @Autowired
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book getBookById(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    public void createBook(Book book) {
        booksRepository.save(book);
    }

    public void updateBook(Long id, Book updatedBook) {
        if (booksRepository.existsById(id)) {
            updatedBook.setId(id);
            booksRepository.save(updatedBook);
        }
    }

    public void deleteBook(Long id) {
        booksRepository.deleteById(id);
    }
}