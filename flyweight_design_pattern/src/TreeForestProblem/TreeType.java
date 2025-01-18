package TreeForestProblem;

// Flyweight: Represents shared intrinsic state
// Separate intrinsic state (shared and immutable)
public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a tree of type " + name + ", color: " + color + ", texture: " + texture + " at coordinates (" + x + ", " + y + ")");
    }



}
