package ro.uvt.info.splabmm1.service;


import ro.uvt.info.splabmm1.service.AlignStrategy;
import ro.uvt.info.splabmm1.model.Context;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(String paragraph, Context context) {
        for (int i = 0; i < context.getY(); i++) {
            System.out.println("\n");
        }
        int currentWidth = 0;
        StringBuilder xStartPosition = new StringBuilder();
        xStartPosition.append(" ".repeat(Math.max(0, context.getX())));
        System.out.print(xStartPosition);
        for(String word: paragraph.split(" ")) {
            final int wordLen = word.length();
            if (wordLen + currentWidth > context.getWidth()) {
                System.out.print("\n");
                System.out.print(xStartPosition);
                currentWidth = 0;
            }
            System.out.print(word + " ");
            currentWidth += wordLen;
        }
    }
}