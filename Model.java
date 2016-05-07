import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:24 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Model {
    private ArrayList<Triangle> triangles;
    private double maxX = 0.0;
    private double minX = 0.0;
    private double maxY = 0.0;
    private double minY = 0.0;
    private double maxZ = 0.0;
    private double minZ = 0.0;

    public Model(ArrayList<Triangle> triangles) {
        this.triangles = triangles;
        for(Triangle triangle : triangles) {
            for(Point point : triangle.points) {
                if(point.getX() > maxX) maxX = point.getX();
                if(point.getY() > maxY) maxY = point.getY();
                if(point.getZ() > maxZ) maxZ = point.getZ();
                if(point.getX() < minX) minX = point.getX();
                if(point.getY() < minY) minY = point.getY();
                if(point.getZ() < minZ) minZ = point.getZ();
            }

        }
    }

    public ArrayList<Triangle> getTriangles() {
        return triangles;
    }

    public void setTriangles(ArrayList<Triangle> triangles) {
        this.triangles = triangles;
    }
    public double getMinX() {
        return minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMaxY() {
        return maxY;
    }

    public double getMinY() {
        return minY;
    }

    public double getMaxZ() {
        return maxZ;
    }

    public double getMinZ() {
        return minZ;
    }
}
