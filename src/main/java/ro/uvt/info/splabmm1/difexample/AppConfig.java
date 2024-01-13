package ro.uvt.info.splabmm1.difexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.uvt.info.splabmm1.difexample.component.ClientComponent;
import ro.uvt.info.splabmm1.difexample.component.SingletonComponent;
import ro.uvt.info.splabmm1.difexample.component.TransientComponent;

@Configuration
public class AppConfig {
    @Bean("clientComponent1")
    public ClientComponent clientComponent1(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        return new ClientComponent(transientComponent, singletonComponent);
    }

    @Bean("clientComponent2")
    public ClientComponent clientComponent2(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        return new ClientComponent(transientComponent, singletonComponent);
    }
}