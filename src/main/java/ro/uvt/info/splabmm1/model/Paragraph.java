package ro.uvt.info.splabmm1.model;


import ro.uvt.info.splabmm1.service.AlignStrategy;

public class Paragraph implements Element, Visitee {

    private final String text;
    private final AlignStrategy strategy;
    private  final Context context;

    public Paragraph(String text, AlignStrategy strategy, Context context) {
        this.text = text;
        this.strategy = strategy;
        this.context = context;
    }

    public void setAlignStrategy() {
        strategy.render(text, context);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public String getText() {
        return this.text;
    }
}