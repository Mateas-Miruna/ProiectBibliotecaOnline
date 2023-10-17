package ro.uvt.info.splabmm1;

public class Image {
    private String imageName;
    public Image(String imageName) {
        this.imageName = imageName;
    }


    // Getter și setter pentru imageName
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Imagine: " + imageName);
    }
}

