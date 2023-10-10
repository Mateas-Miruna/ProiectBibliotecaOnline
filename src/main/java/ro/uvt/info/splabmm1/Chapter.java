package ro.uvt.info.splabmm1;
import java.util.List;
public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    // Constructor, getteri și setteri
    // ...

    public void print() {
        System.out.println("Capitol: " + name);

        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}

