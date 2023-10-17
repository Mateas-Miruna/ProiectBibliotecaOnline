package ro.uvt.info.splabmm1;

public class main {
    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Chapter 1");
        SubChapter subChapter1 = new SubChapter("SubChapter 1");
        subChapter1.add(new Image("Image 1.1"));
        subChapter1.add(new Paragraph("Paragraph 1.1"));
        subChapter1.add(new Table("Table 1.1"));
        chapter1.add(subChapter1);

        // Create more chapters, subchapters, and content as needed

        // Print the book
        chapter1.print();
    }
}
