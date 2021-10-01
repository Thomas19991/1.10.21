package at.technikum.swe;

public abstract class Figure implements Drawable {
    protected String name;
    protected int x;
    protected int y;

    public Figure(String name, int x) {
        this("noname", 0, 0);
    }
    public Figure(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
