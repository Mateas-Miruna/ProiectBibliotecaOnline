package ro.uvt.info.splabmm1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.awt.*;
@Entity
@NoArgsConstructor(force = true)
public class ImageProxy implements Picture, Visitee, Element {
    private String url;
    private Dimension dim;
    private Image realImage;
    @Id
    private Long id;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}