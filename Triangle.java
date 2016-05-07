import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:29 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public LinkedList<Point> points = new LinkedList<Point>();

    public double distanceTo(Point point) {
        return (a.distanceTo(point)+b.distanceTo(point)+c.distanceTo(point))/3.0;
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        points.add(this.a);
        points.add(this.b);
        points.add(this.c);
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
