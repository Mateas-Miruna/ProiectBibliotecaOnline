package ro.uvt.info.splabmm1.model;

import java.awt.*;

public interface Picture {
    public String url() throws Exception;
    public Dimension dim() throws Exception;
    public String content() throws Exception;
}