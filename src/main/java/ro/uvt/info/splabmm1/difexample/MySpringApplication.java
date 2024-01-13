package ro.uvt.info.splabmm1.difexample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import ro.uvt.info.splabmm1.difexample.component.ClientComponent;
import ro.uvt.info.splabmm1.difexample.component.SingletonComponent;
import ro.uvt.info.splabmm1.difexample.component.TransientComponent;

@SpringBootApplication
@Configuration
public class MySpringApplication {
    @Qualifier("clientComponent1")
    private final ClientComponent clientComponent1;

    @Qualifier("clientComponent2")
    private final ClientComponent clientComponent2;

    @Autowired
    public MySpringApplication(ClientComponent clientComponent1, ClientComponent clientComponent2) {
        this.clientComponent1 = clientComponent1;
        this.clientComponent2 = clientComponent2;
    }
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);

        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        //Second instance
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        //Second instance
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        context.getBean(MySpringApplication.class).clientComponent1.operation();
        context.getBean(MySpringApplication.class).clientComponent2.operation();
    }
}