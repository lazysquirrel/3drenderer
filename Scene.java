import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:23 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class Scene {
    private LinkedList<Model> models;
    private Point lightSource;

    public void addModel(Model model) {
        models.add(model);
    }

    public Scene() {
        models = new LinkedList<Model>();
    }
}
