package at.technikum.swe;

public class ConsoleDrawBoard implements DrawBoard {
    @Override
    public void startDrawing(String name) {
        System.out.print(name);
        System.out.println(":");
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        StringBuffer sb = new StringBuffer();
        sb.append("  Line: x1=");
        sb.append(x1);
        sb.append(", y1=");
        sb.append(y1);
        sb.append(", x2=");
        sb.append(x2);
        sb.append(", y2=");
        sb.append(y2);
        System.out.println(sb.toString());
    }

    @Override
    public void drawCircle(int x1, int y1, int r) {
        StringBuffer sb = new StringBuffer();
        sb.append("  Circle: x1=");
        sb.append(x1);
        sb.append(", y1=");
        sb.append(y1);
        sb.append(", r=");
        sb.append(r);
        System.out.println(sb.toString());
    }

    @Override
    public void endDrawing() {
        System.out.println("--------------------------------");
    }

    @Override
    public void drawXEck(int x1, int l) {
        StringBuffer sb = new StringBuffer();
        sb.append("  XEck: Corners=");
        sb.append(x1);
        sb.append(", Side length=");
        sb.append(l);
        System.out.println(sb.toString());
    }
}
