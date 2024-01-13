package ro.uvt.info.splabmm1.model;


import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.splabmm1.service.*;

public class Paragraph implements Element, Visitee{
    @Getter
    @Setter
    private String text;
    private Element parent;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
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

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + "\n" + alignStrategy.render(this.text));
    }
}