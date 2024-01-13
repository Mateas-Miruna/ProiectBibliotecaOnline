package ro.uvt.info.splabmm1.model;

import java.io.IOException;

public interface Element extends Visitee {
    public void print() throws IOException;
    public void add(Element element) throws Exception;
    public void remove(Element element) throws Exception;
    public Element get(int index) throws Exception;
    public void setParent(Element parent);
    public Element getParent();

    @Override
    public void accept(Visitor visitor) throws IOException;
}