package at.technikum.swe;

public class Rechteck extends Figure {
    protected int l;
    protected int b;

    public Rechteck() {
        this("noname", 0, 0, 0, 0);
    }
    public Rechteck(String name, int x, int y, int l, int b) {
        super(name, x, y);
        this.l = l;
        this.b = b;
    }

    public void draw(DrawBoard drawBoard) {
        drawBoard.startDrawing(name);
        drawBoard.drawLine(x, y, x+l, y);
        drawBoard.drawLine(x+l, y, x+l, y+b);
        drawBoard.drawLine(x+l, y+b, x, y+b);
        drawBoard.drawLine(x, y+b, x, y);
        drawBoard.endDrawing();
    }

}
