import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:04 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        FileProcessor fp = new FileProcessor();
        Model firstModel = new Model(fp.ReadFile("/home/basti/Downloads/TestRad.inc"));
        Scene firstScene = new Scene();
        firstScene.addModel(firstModel);
        int height = this.getHeight();
        int width = this.getWidth();
        int[] xCoordinates = new int[3];
        int[] yCoordinates = new int[3];
        Point lightSource = new Point(3.0, 1.0, 2.4);

//        setBackground(Color.black);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        g2d.setColor(Color.black);
        g2d.drawString("mts31.smueller", 20, 20);
        for(Triangle triangle : firstModel.getTriangles()) {
            int newIntensity = (int)triangle.distanceTo(lightSource)*(254/22);
            if (newIntensity > 254) newIntensity = 254;
//            g2d.setColor(new Color((int)newIntensity,(int)newIntensity,255));
            g2d.setColor(new Color(0.2f,0.2f,0.2f,0.3f));
            int magnification = 50;
//            xCoordinates[0] = (int)((triangle.getA().getX()*triangle.getA().getY())*magnification)+width/2;
//            xCoordinates[1] = (int)(triangle.getB().getX()*magnification)+width/2;
//            xCoordinates[2] = (int)(triangle.getC().getX()*magnification)+width/2;
//            yCoordinates[0] = (int)(triangle.getA().getZ()*magnification)+height/2;
//            yCoordinates[1] = (int)(triangle.getB().getZ()*magnification)+height/2;
//            yCoordinates[2] = (int)(triangle.getC().getZ()*magnification)+height/2;

            xCoordinates[0] = (int)((triangle.getA().getX()+triangle.getA().getY())*magnification)+width/2;
            xCoordinates[1] = (int)((triangle.getB().getX()+triangle.getB().getY())*magnification)+width/2;
            xCoordinates[2] = (int)((triangle.getC().getX()+triangle.getC().getY())*magnification)+width/2;
            yCoordinates[0] = (int)((triangle.getA().getZ()+triangle.getA().getY())*magnification)+height/2;
            yCoordinates[1] = (int)((triangle.getB().getZ()+triangle.getB().getY())*magnification)+height/2;
            yCoordinates[2] = (int)((triangle.getC().getZ()+triangle.getC().getY())*magnification)+height/2;

                g2d.fillPolygon(xCoordinates, yCoordinates, 3);
            if(triangle.distanceTo(lightSource) < 10) {
                g2d.setColor(Color.black);
//                g2d.setColor(new Color());
//                g2d.drawPolygon(xCoordinates, yCoordinates, 3);
            }
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
