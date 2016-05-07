/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:29 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Point {
    private double[] coordinates;

    public double[] getCoordinates() {
        return coordinates;
    }

    public double getZ() {
        return coordinates[2];
    }

    public double getY() {
        return coordinates[1];
    }

    public double getX() {
        return coordinates[0];
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(getX()-point.getX(), 2.0)+Math.pow(getY()-point.getY(), 2.0)+Math.pow(getZ()-point.getZ(), 2.0));
    }

    public Point(double x, double y, double z) {
        coordinates = new double[4];
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        coordinates[3] = 1.0;
    }
}
