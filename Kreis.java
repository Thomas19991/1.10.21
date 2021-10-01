package at.technikum.swe;

/**
 * Klasse Kreis - abgeleitet von Figur
 * @autor ich
 */
public class Kreis extends Figure {
    /** Radius 123 */
    protected int r;

    public Kreis() {
        this("noname", 0, 0, 0);
    }

    /**
     * Konstruktor Kreis mit allen Parametern
     * @param name Name der Figur
     * @param x    Mittelpunkt x Koordinate
     * @param y    Mittelpunkt y Koordinate
     * @param r    Radius
     */
    public Kreis(String name, int x, int y, int r) {
        super(name, x, y);
        this.r = r;
    }

    public void draw(DrawBoard drawBoard) {
        drawBoard.startDrawing(name);
        drawBoard.drawCircle(x, y, r);
        drawBoard.endDrawing();
    }

}
