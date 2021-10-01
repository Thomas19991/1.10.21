package at.technikum.swe;

public interface DrawBoard {
    public void startDrawing(String name);
    public void drawLine(int x1, int y1, int x2, int y2);
    public void drawCircle(int x1, int y1, int r);
    public void endDrawing();
    public void drawXEck(int x1, int l);
}
