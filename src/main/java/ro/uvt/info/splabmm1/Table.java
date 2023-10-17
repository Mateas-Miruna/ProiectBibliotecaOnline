package ro.uvt.info.splabmm1;

/*public class Table {
    private String title;
    public Table(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Tabel: " + title);
    }
}*/
public class Table extends BookComponent {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table: " + title);
    }
}
