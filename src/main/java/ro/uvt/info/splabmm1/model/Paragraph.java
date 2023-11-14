package ro.uvt.info.splabmm1.model;

import ro.uvt.info.splabmm1.service.AlignLeft;
import ro.uvt.info.splabmm1.service.AlignStrategy;

public class Paragraph implements Element {
    private String name;
    private AlignStrategy align;
    public Paragraph(String name){
        this.name = name;
        align = new AlignLeft();
    }

    @Override
    public void print(){
        if(align == null)
            System.out.println("Paragraph: " + name);
        else
            align.render(name);
    }


    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeElement(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i) {
        throw new UnsupportedOperationException();
    }


    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }
}
