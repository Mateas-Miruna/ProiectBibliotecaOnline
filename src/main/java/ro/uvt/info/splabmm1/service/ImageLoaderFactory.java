package ro.uvt.info.splabmm1.service;

import java.io.IOException;

public class ImageLoaderFactory {
    public void createImageLoader(String url) throws IOException {
        if (url.contains("bmp"))
            new BMPImageLoader().loadImage(url);
        else if (url.contains("jpg"))
            new JPGImageLoader().loadImage(url);
        else
            throw new IOException("Image type unsupported!");
    }


}