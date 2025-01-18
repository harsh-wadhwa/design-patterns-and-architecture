package TreeForestProblem;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory: Creates and manages Flyweight objects
// Implement a factory to manage and reuse flyweight instances based on intrinsic state.
public class TreeTypeFactory {

    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + ":" + color + ":" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("Created new tree type: " + key);
        }
        return treeTypes.get(key);
    }


}
