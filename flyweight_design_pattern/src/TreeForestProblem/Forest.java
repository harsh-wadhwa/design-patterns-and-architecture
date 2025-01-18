package TreeForestProblem;

import java.util.HashMap;
import java.util.Map;

// Client: Manages extrinsic state and uses Flyweight
// Pass the extrinsic state to the flyweight object during method calls or use a context object.
public class Forest {

    private final Map<String, Tree> trees = new HashMap<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.put(x+ ":" + y, tree);
    }

    public void draw() {
        for (Tree tree: trees.values()) {
            tree.draw();
        }
    }

}
