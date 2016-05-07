import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:08 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Skeleton extends JFrame {
    public Skeleton() {
        initUI();
    }
    private void initUI() {
        setTitle("Simple window");
        add(new Surface());
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Skeleton sk = new Skeleton();
                sk.setVisible(true);
            }
        }
        );
    }
}
