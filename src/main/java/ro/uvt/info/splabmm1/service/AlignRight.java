package ro.uvt.info.splabmm1.service;

import ro.uvt.info.splabmm1.service.AlignStrategy;
import ro.uvt.info.splabmm1.model.Context;
public class AlignRight implements AlignStrategy {

    @Override
    public void render(String paragraph, Context context) {
        for (int i = 0; i < context.getY(); i++) {
            System.out.println("\n");
        }
        StringBuilder xStartPosition = new StringBuilder();
        xStartPosition.append(" ".repeat(Math.max(0, context.getX())));
        int currentWidth = 0;
        StringBuilder line = new StringBuilder();
        for(String word: paragraph.split(" ")) {
            final int wordLen = word.length() + 1;
            if (wordLen + currentWidth > context.getWidth()) {
//                System.out.println(wordLen);
//                System.out.println(currentWidth);
//                System.out.println(context.getWidth());
//                System.out.println(context.getWidth() - currentWidth + wordLen);
                System.out.print(" ".repeat(Math.max(0, context.getWidth() - currentWidth + wordLen)));
                System.out.print(xStartPosition);
                System.out.print(line);
                line.setLength(0);
                currentWidth = 0;
                System.out.print("\n");
            }
            line.append(" " + word);
            currentWidth += wordLen;
        }
    }
}