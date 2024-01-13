package ro.uvt.info.splabmm1.service;

import ro.uvt.info.splabmm1.model.*;
public class RenderVisitor implements Visitor{
    private int paragraphCount = 0;
    private int tableCount = 0;
    private int tableOfContentsCount = 0;
    private  int imageCount = 0;
    @Override
    public Book visitBook(Book book) {
        System.out.println("Book Statistics: ");
        return book;
    }

    @Override
    public Section visitSection(Section section) {
        System.out.println("Section statistics: ");
        return section;
    }

    @Override
    public Paragraph visitParagraph(Paragraph paragraph) {
        paragraphCount++;
        return paragraph;
    }

    @Override
    public Table visitTable(Table table) {
        tableCount++;
        return table;
    }

    public TableOfContents visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContentsCount++;
        return tableOfContents;
    }

    public ImageProxy visitImageProxy(ImageProxy imageProxy) {
        imageCount++;
        return imageProxy;
    }

    public Image visitImage(Image image) {
        imageCount++;
        return image;
    }

    public void getStatistics() {
        System.out.println("Paragraphs: " + paragraphCount);
        System.out.println("Images: " + imageCount);
        System.out.println("Tables: " + tableCount);
        System.out.println("Tables of Content: " + tableOfContentsCount);
    }
}