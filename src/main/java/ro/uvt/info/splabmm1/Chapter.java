package ro.uvt.info.splabmm1;
import java.util.List;
public class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    public Chapter(String name, List<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter și setter pentru subChapters
    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public void print() {
        System.out.println("Capitol: " + name);

        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}

