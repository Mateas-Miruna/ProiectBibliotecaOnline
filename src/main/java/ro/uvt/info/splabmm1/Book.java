package ro.uvt.info.splabmm1;
import lombok.Getter;

import java.util.List;
public class Book {
        @Getter
        private String title;
        private Author autor;
    public Book(String title, Author autor, TableOfContents tableOfContents, List<Chapter> chapters) {
        this.title = title;
        this.autor = autor;
        this.tableOfContents = tableOfContents;
        this.chapters = chapters;
    }
    // Getter și setter pentru tableOfContents
    @Getter
    private TableOfContents tableOfContents;
    // Getter și setter pentru chapters
    @Getter
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter și setter pentru autor
    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
        public void print() {
            //System.out.println("Carte: " + title);
            //System.out.println("Autor: " + autor.getNume());
            tableOfContents.print();

            for (Chapter chapter : chapters) {
                chapter.print();

        }
    }

}
