package ro.uvt.info.splabmm1.model;

import java.util.List;

public interface TextElement {


    default List<TextElement> add(List<TextElement> l, TextElement element){
        l.add(element);
        return l;
    }
    default TextElement get(List<TextElement> l, int index) {
        return l.get(index);
    }
    default void remove(List<TextElement> l, TextElement element) {
        l.remove(element);
    }
}