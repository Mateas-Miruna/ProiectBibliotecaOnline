package ro.uvt.info.splabmm1.difexample;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splabmm1.model.Book;

import java.io.IOException;

public class SseObserver  {
    public SseObserver(SseEmitter emitter) {
    }
    public void update(Book book) throws IOException {
        SseEmitter emitter = null;
        emitter.send(book, MediaType.APPLICATION_JSON);
    }
}