package ro.uvt.info.splabmm1.model;
public interface Visitor {

    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContent tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitBook(Book book);
}