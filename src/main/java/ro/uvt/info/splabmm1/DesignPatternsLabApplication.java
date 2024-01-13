package ro.uvt.info.splabmm1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splabmm1.model.*;
import ro.uvt.info.splabmm1.service.*;

@SpringBootApplication
public class DesignPatternsLabApplication {
    public static void main(String[] args) throws Exception{
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));

        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        b.add(cap1);
        b.add(cap2);
        TableOfContentsVisitor tocUpdate = new TableOfContentsVisitor();
        b.accept(tocUpdate);
        tocUpdate.getToC().print();

        BookSaveVisitor bookSaveVisitor = new BookSaveVisitor();
        b.accept(bookSaveVisitor);
        bookSaveVisitor.transferToJSON("book_data.json");
    }



}