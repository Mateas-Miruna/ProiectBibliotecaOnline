package ro.uvt.info.splabmm1;

/*import org.springframework.boot.autoconfigure.SpringBootApplication;


import ro.uvt.info.splabmm1.model.Book;
import ro.uvt.info.splabmm1.model.Image;
import ro.uvt.info.splabmm1.model.Section;

@SpringBootApplication
public class Splabmm1Application {

    public static void main(String[] args) {
        //SpringApplication.run(SpLabApplication.class, args);


        long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");



    }




}*/