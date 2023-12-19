package ro.uvt.info.splabmm1.model;
import lombok.Getter;

@Getter
public class Context {
    private int x;
    private int y;
    private int w;
    private int pageX;
    private int pageY;
    public Context(int x, int y, int w) {
        this.pageX = 1000;
        this.pageY = 1000;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public int getWidth() {
        return this.w;
    }
}