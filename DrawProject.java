package at.technikum.swe;

import java.security.cert.X509Certificate;
import java.util.ArrayList;

public class DrawProject {

    public static void main(String[] args) {

        DrawBoard db = new ConsoleDrawBoard();
        DrawBoard b = new GraphicDrawBoard();
        FigureGroup fg = new FigureGroup("Figure Group 1", 0, 0);
        Kreis k1 = new Kreis("Kreis 1", 100, 100, 70);
        Rechteck r1 = new Rechteck("Rechteck 1", 50, 50, 120, 70);
        Kreis k2 = new Kreis("Kreis 2", 20, 30, 90);
        XEck e1 = new XEck("XEck 1", 20, 5);

        fg.addFigure(k1);
        fg.addFigure(r1);
        fg.addFigure(k2);
        fg.addFigure(e1);

        fg.draw(db);
        fg.draw(b);
    }


}