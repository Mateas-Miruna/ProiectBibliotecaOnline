package ro.uvt.info.splabmm1.model;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Book extends Section implements Element, Visitee {

    private final String title;
    private final List<Author> authors = new ArrayList<>();
    private final List<Section> sections = new ArrayList<>();

    @JsonCreator
    public Book(String title) {
        super(title);
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createSection(Section section) {
        sections.add(section);
        return sections.indexOf(section);
    }

    public Section getSection(int index) {
        return sections.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

}