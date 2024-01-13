package ro.uvt.info.splabmm1.model;


import java.io.IOException;

public interface Visitee {
    public void accept(Visitor visitor) throws IOException;
}