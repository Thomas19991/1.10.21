package at.technikum.swe;

import java.util.ArrayList;

public class FigureGroup extends Figure {
    ArrayList<Figure> children;

    public FigureGroup(String name, int x1, int y1) {
        super(name, x1, y1);
    }

    public void addFigure(Figure f) {
        if (children == null) {
            children = new ArrayList<Figure>();
        }
        children.add(f);
    }

    @Override
    public void draw(DrawBoard drawBoard) {
        for (Figure f : children) {
            f.draw(drawBoard);
        }
    }
}
