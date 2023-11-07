package ro.uvt.info.splabmm1;

public class Table implements Element{
    private String name;
    public Table(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Table name: " + name);
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
}