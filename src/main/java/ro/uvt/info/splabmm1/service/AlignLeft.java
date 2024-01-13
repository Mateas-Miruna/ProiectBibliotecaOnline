package ro.uvt.info.splabmm1.service;


public class AlignLeft implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + -20 + "s", paragraph);
    }
}