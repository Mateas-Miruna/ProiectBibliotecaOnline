package ro.uvt.info.splabmm1.service;

import ro.uvt.info.splabmm1.model.*;
import org.slf4j.event.KeyValuePair;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TableOfContentsVisitor implements Visitor{
    private final TableOfContents toc;
    private int pageCounter = 1;

    public TableOfContentsVisitor() {
        this.toc = new TableOfContents();
    }

    public TableOfContents getToC() {
        return this.toc;
    }

    @Override
    public Book visitBook(Book book) {
        //pageCounter++;
        //this.toc.addEntry(pageCounter + ".........." + book.getTitle());
        return book;
    }

    @Override
    public Section visitSection(Section section) {
        this.toc.addEntry(section.getTitle() + " .......... " + pageCounter);
        // pageCounter++;
        return section;
    }

    @Override
    public TableOfContents visitTableOfContents(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Paragraph visitParagraph(Paragraph paragraph) {
        pageCounter++;
        //this.toc.addEntry(pageCounter + ".........." + paragraph.getText());
        return paragraph;
    }

    @Override
    public ImageProxy visitImageProxy(ImageProxy imageProxy) throws IOException {
        pageCounter++;
        //this.toc.addEntry(".........." + "Image Proxy");
        return imageProxy;
    }

    @Override
    public Image visitImage(Image image) {
        pageCounter++;
        //this.toc.addEntry(pageCounter + ".........." + image.getContent());
        return image;
    }

    @Override
    public Table visitTable(Table table) {
        pageCounter++;
        //this.toc.addEntry(pageCounter + ".........." + table.getTitle());
        return table;
    }

}