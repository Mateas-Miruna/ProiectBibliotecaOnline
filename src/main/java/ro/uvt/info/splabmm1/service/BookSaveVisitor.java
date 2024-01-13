package ro.uvt.info.splabmm1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ro.uvt.info.splabmm1.model.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BookSaveVisitor implements Visitor {
    private Map<String, Object> data;

    public BookSaveVisitor() {
        this.data = new HashMap<>();
    }

    @Override
    public Book visitBook(Book book) {
        return null;
    }

    @Override
    public Section visitSection(Section section) {
        data.put(section.getTitle(), "Section");
        return section;
    }

    @Override
    public TableOfContents visitTableOfContents(TableOfContents tableOfContents) {
        data.put(tableOfContents.getClass().toString(), "TableOfContents");
        return tableOfContents;
    }

    @Override
    public Paragraph visitParagraph(Paragraph paragraph) {
        data.put(paragraph.getText(), "Paragraph");
        return paragraph;
    }

    @Override
    public ImageProxy visitImageProxy(ImageProxy imageProxy) throws IOException {
        data.put(imageProxy.getClass().toString(), "Image Proxy");
        return imageProxy;
    }

    @Override
    public Image visitImage(Image image) {
        data.put(image.getContent(), "Image");
        return image;
    }

    @Override
    public Table visitTable(Table table) {
        data.put(table.getTitle(), "Table");
        return table;
    }

    public void transferToJSON(String filePath)  {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(filePath), data);
            System.out.println("Data saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}