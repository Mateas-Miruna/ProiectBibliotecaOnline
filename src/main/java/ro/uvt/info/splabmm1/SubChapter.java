package ro.uvt.info.splabmm1;

/*public class SubChapter {
    private String name;
    private Image image;
    private Paragraph paragraph;
    private Table table;
    public SubChapter(String name, Image image, Paragraph paragraph, Table table) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter și setter pentru image
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    // Getter și setter pentru paragraph
    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    // Getter și setter pentru table
    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }


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
}*/
public class SubChapter extends BookComponent {
    private String name;
    private List<BookComponent> subComponents = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void add(BookComponent component) {
        subComponents.add(component);
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (BookComponent component : subComponents) {
            component.print();
        }
    }
}
