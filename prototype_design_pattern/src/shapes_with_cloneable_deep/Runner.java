package shapes_with_cloneable_deep;

public class Runner {
    public static void main(String[] args) {

        Address address = new Address("New York");
        Person original = new Person("John", address);

        Person deepClone = original.clone();
        System.out.println("Original: " + original + original.hashCode());
        System.out.println("Clone: " + deepClone + deepClone.hashCode());

        // Modify the address
        address.setCity("Los Angeles");
        System.out.println("After modifying address:");
        System.out.println("Original: " + original + original.hashCode());
        System.out.println("Clone: " + deepClone + deepClone.hashCode());
    }
}
