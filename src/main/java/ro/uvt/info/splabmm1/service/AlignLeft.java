package ro.uvt.info.splabmm1.service;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println(text);
    }
}