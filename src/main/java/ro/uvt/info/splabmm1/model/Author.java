package ro.uvt.info.splabmm1.model;
import lombok.Getter;

import lombok.Getter;
import lombok.Setter;

public class Author {
    @Getter
    @Setter
    private String name;

    public Author (String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + this.name);
    }
}