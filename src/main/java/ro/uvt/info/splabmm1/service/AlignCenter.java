package ro.uvt.info.splabmm1.service;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(String text) {
        int width = 80;
        int padSize = (width - text.length()) / 2;
        String pad = String.format("%"+padSize+"s", "");
        System.out.println(pad + text);
    }
}