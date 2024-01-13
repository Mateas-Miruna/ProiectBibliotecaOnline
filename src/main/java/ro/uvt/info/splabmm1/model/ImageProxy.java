package ro.uvt.info.splabmm1.model;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class ImageProxy implements Element, Picture, Visitee{
    private static Image image;
    private Element parent;
    private String url;
    private String content;
    private Dimension dim;

    public ImageProxy(String content) {
        this.content = content;
        this.url = "";
        this.dim = new Dimension(0,0);
    }

    public ImageProxy(String content, String url) {
        this.content = content;
        this.url = url;
        this.dim = new Dimension(0,0);
    }

    public ImageProxy(String content, String url, Dimension dim) {
        this.content = content;
        this.url = url;
        this.dim = dim;
    }

    public Image loadImage() throws IOException {
        if (image == null) {
            image = new Image(content, url, dim);
        }
        return image;
    }

    @Override
    public String content() throws Exception {
        throw new Exception("You cannot display the content of the image inside a Proxy!");
    }

    @Override
    public String url() throws Exception {
        throw new Exception("You cannot display the url of the image inside a Proxy!");
    }

    @Override
    public Dimension dim() throws Exception {
        throw new Exception("You cannot display the dimension of the image inside a Proxy!");
    }

    @Override
    public void add(Element element) throws Exception {
        throw new Exception("You cannot add an element to a Proxy!");
    }

    @Override
    public void remove(Element element) throws Exception {
        throw new Exception("You cannot remove an element from a Proxy!");
    }

    @Override
    public Element get(int index) throws Exception {
        throw new Exception("You cannot get an element from a Proxy!");
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public void setParent(Element parent) {
        this.parent = parent;
    }

    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visitImageProxy(this);
    }

    @Override
    public void print() throws IOException {
        loadImage().print();
    }
}