package ro.uvt.info.splabmm1.model;

import java.util.ArrayList;
import java.util.List;
public class Section implements Element, Visitee {

    private String name;
    private List<Element> content = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    @Override
    public void add(Element elm) {
        content.add(elm);
    }

    @Override
    public void remove(Element elm) {
        content.remove(elm);
    }

    @Override
    public Element getElement(int index) {
        return content.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public String getName() {
        return this.name;
    }

    public List<Element> getContent() {
        return this.content;
    }
}