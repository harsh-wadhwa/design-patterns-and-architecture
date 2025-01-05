package shapes_with_prototype_interface;

public class Runner {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(45, "red");
        System.out.println("Original Circle at " + originalCircle.hashCode() + " : " + originalCircle);

        Circle clonedCircle = originalCircle.clone();
        System.out.println("Cloned circle at " + clonedCircle.hashCode() + " : " + clonedCircle);
    }
}
