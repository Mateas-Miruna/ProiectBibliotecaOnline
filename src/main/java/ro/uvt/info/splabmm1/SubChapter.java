package ro.uvt.info.splabmm1;

public class SubChapter {
    private String name;
    private Image image;
    private Paragraph paragraph;
    private Table table;

    // Constructor, getteri și setteri
    // ...

    public void print() {
        System.out.println("SubCapitol: " + name);
        if (image != null) {
            image.print();
        }
        if (paragraph != null) {
            paragraph.print();
        }
        if (table != null) {
            table.print();
        }
    }
}
