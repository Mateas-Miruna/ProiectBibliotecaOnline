package ro.uvt.info.splabmm1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class TableOfContents implements Element, Visitee{

    @Getter
    @Setter
    private ArrayList<String> entries;
    private Element parent;
    public TableOfContents() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        this.entries.add(entry);
    }
    @Override
    public void add(Element element) throws Exception {
        throw new Exception("You cannot add an element to a node element!");
    }

    @Override
    public void remove(Element element) throws Exception {
        throw new Exception("You cannot remove an element from a leaf node!");
    }

    @Override
    public Element get(int index) throws Exception {
        throw new Exception("You cannot extract an element from a leaf node!");
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
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    @Override
    public void print() {
        System.out.println("Table of Contents:");
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i));
        }
    }
}