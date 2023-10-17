package ro.uvt.info.splabmm1;

import lombok.Getter;

@Getter
public class Author {
    private String nume;

    public Author(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void print() {
        System.out.println("Autor: " + nume);
    }
}
