package ro.uvt.info.splabmm1.model;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Section implements Element, Visitee{
    @Getter
    @Setter
    private String title;
    private Element parent;
    protected Collection<Element> elementCollection;
    public Section(String title) {
        this.title = title;
        this.elementCollection = new ArrayList<>();
    }

    @Override
    public void add(Element element) throws Exception {
        //System.out.println("Element addition completed successfully!");
        if (element.getParent() != null)
            throw new Exception("You can not add an existing element to the book!");
        else {
            this.elementCollection.add(element);
            element.setParent(this);
        }
    }

    @Override
    public void remove(Element element) {
        // System.out.println("Element has been removed!");
        this.elementCollection.remove(element);
        element.setParent(null);
    }

    @Override
    public void setParent(Element parent) {
        this.parent = parent;
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public Element get(int index) {
        int localIndex = 0;
        for (Element elem : this.elementCollection) {
            if (localIndex == index)
                return elem;
            localIndex++;
        }
        return null;
    }

    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visitSection(this);

        for (Element element : this.elementCollection)
            element.accept(visitor);
    }

    @Override
    public void print() throws IOException {
        System.out.println(this.title);
        for (Element elem : this.elementCollection)
            elem.print();
    }
}