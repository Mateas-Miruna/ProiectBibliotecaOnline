package ro.uvt.info.splabmm1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Table implements Visitee, Element {

    private String title;
    @Id
    private Long id;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}