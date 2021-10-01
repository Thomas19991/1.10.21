package at.technikum.swe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicDrawBoard extends JFrame implements DrawBoard {

    private ArrayList<GraphicObject> gos = new ArrayList<GraphicObject>();

    private JPanel drawingBoard = new JPanel() {
        public void paint(Graphics g) {
            g.setColor(Color.white);
            for (GraphicObject go : gos) {
                go.draw(g);
            }
        }
    };

    public GraphicDrawBoard() {
        setTitle("GraphicsDrawingBoard");
        setBackground(Color.black);
        setSize(800, 600);
        setContentPane(drawingBoard);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void startDrawing(String name) {

    }

    @Override
    public void endDrawing() {

    }

    @Override
    public void drawXEck(int x1, int l) {
        Circle x = new Circle(x1, l);
        this.gos.add(x);
        drawingBoard.updateUI();
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        Line l = new Line(x1, y1, x2, y2);
        this.gos.add(l);
        drawingBoard.updateUI();
    }

    @Override
    public void drawCircle(int x1, int y1, int r) {
        Circle c = new Circle(x1, y1, r);
        this.gos.add(c);
        drawingBoard.updateUI();
    }

    public void drawCircle(int x1, int l) {
        Circle c = new Circle(x1, l);
        this.gos.add(c);
        drawingBoard.updateUI();
    }

    private abstract class GraphicObject {
        protected int x1, y1;
        public GraphicObject(int x1, int y1) {
            this.x1 = x1;
            this.y1 = y1;
        }
        public abstract void draw(Graphics g);
    }

    private class Circle extends GraphicObject {
        private int r;

        public Circle(int x1, int y1, int r) {
            super(x1, y1);
            this.r = r;
        }

        public Circle(int x1, int l) {
            super(x1, l);
        }

        public void draw(Graphics g) {
            g.drawArc(x1, y1, r, r, 0, 360);
        }
    }
    private class Line extends GraphicObject {
        private int x2, y2;
        public Line(int x1, int y1, int x2, int y2) {
            super(x1, y1);
            this.x2 = x2;
            this.y2 = y2;
        }
        public void draw(Graphics g) {
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
