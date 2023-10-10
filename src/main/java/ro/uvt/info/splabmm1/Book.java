package ro.uvt.info.splabmm1;
import java.util.List;
public class Book {
        private String title;
        private Author autor;
        private TableOfContents tableOfContents;
        private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
    }

    // Constructor, getteri și setteri
        // ...

        public void print() {
            //System.out.println("Carte: " + title);
            //System.out.println("Autor: " + autor.getNume());
            tableOfContents.print();

            for (Chapter chapter : chapters) {
                chapter.print();

        }
    }

}
