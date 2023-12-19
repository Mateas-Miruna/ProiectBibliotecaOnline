package ro.uvt.info.splabmm1.difexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.splabmm1.difexample.Controllers.BookController;
import ro.uvt.info.splabmm1.difexample.Controllers.HelloController;

@Component
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;
    private final HelloController hc;

    private final BookController bc;
    @Autowired
    public ClientComponent(TransientComponent tc, SingletonComponent
            sc, HelloController hc, BookController bc) {
        this.tc = tc;
        this.sc = sc;
        this.hc = hc;
        this.bc = bc;
    }
}