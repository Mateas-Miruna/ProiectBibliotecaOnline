package ro.uvt.info.splabmm1.model;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Book extends Section{
    private final String title;
    private Long id;
    private final Collection<Author> authorCollection = new ArrayList<>();
    public Book(String title) {
        super(null);
        this.title = title;
    }

    public void add(Element element) throws Exception {
        //System.out.println("Element added successfully to the book!");
        if (element.getParent() != null)
            throw new Exception("You cannot add an existing element to the book!");
        else {
            this.elementCollection.add(element);
            element.setParent(this);
        }
    }

    public void remove(Element element) {
        //System.out.println("Element removed successfully from the book!");
        this.elementCollection.remove(element);
        element.setParent(null);
    }

    public Element get(int index) {
        int localIndex = 0;
        for (Element element : this.elementCollection) {
            if (localIndex == index)
                return element;
            localIndex++;
        }
        return null;
    }

    public void addAuthor(Author author) {
        this.authorCollection.add(author);
    }

    public void removeAuthor(Author author) {
        this.authorCollection.remove(author);
    }

    public Author getAuthor(int index) {
        int localIndex = 0;
        for (Author auth : this.authorCollection) {
            if (localIndex == index)
                return auth;
            localIndex++;
        }
        return null;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visitBook(this);

        for (Element element : this.elementCollection)
            element.accept(visitor);
    }

    public void print() throws IOException {
        System.out.println("Book: " + this.title);
        System.out.println("Authors: ");

        for (Author auth : this.authorCollection)
            auth.print();

        System.out.println();
        for (Element elem: this.elementCollection)
            elem.print();
    }
}