package ro.uvt.info.splabmm1.service;

public class AlignCenter implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + 20 + "s", paragraph);
    }
}