package TreeForestProblem;

public class Main {
    public static void main(String[] args) {

        Forest forest = new Forest();

        forest.plantTree(1,2, "Oak", "Green", "Rough");
        forest.plantTree(3,4, "Pine", "Dark Green", "Smooth");
        forest.plantTree(3,6, "Oak", "Green", "Rough");   // Reuses the flyweight

        forest.draw();

    }
}