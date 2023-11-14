package ro.uvt.info.splabmm1.model;

import java.util.ArrayList;
import java.util.List;

public class Book{
    private String title;

    private List<Element> sections;
    private List<Author> authors;

    public Book(String title, List<Element> sections){
        this.title = title;

        this.sections = sections;
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public Book(String title){
        this.title =  title;
        authors = new ArrayList<Author>();
        sections = null;
    }

    public int createSection(String ChapterTitle){
        if (sections == null){
            sections = new ArrayList<Element>();
        }
        Section newSection = new Section("ChapterTitle");
        sections.add(newSection);
        return sections.size();
    }

    public void print(){
        System.out.println("Book: " + title);
        System.out.println("\nAuthors: ");
        for(Author a: authors)
            a.print();
        System.out.println();
        for(Element e:sections)
            e.print();
    }

    public Element getSection(int index) {
        return sections.get(index - 1);
    }

    public void addContent(Element paragraph) {
        if(sections == null) sections = new ArrayList<Element>();
        sections.add(paragraph);
    }
}