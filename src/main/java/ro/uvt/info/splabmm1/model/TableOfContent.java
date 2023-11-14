package ro.uvt.info.splabmm1.model;

public class TableOfContent implements Element {
    public void print(){
        System.out.println("Sample");
    }
    @Override
    public void add(Element e){
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeElement(Element e){
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i){
        throw new UnsupportedOperationException();
    }
}