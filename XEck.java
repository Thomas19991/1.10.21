package at.technikum.swe;

public class XEck extends Figure implements Drawable{
    protected int corners;
    protected int sidelengh;

    public XEck() {
        this("noname", 0, 0);
    }

    public XEck(String name, int x, int y) {
        super(name, x, y);
    }

    public void draw(DrawBoard drawBoard) {
        drawBoard.startDrawing(name);
        drawBoard.drawXEck(x, y);
        drawBoard.endDrawing();
    }

}
