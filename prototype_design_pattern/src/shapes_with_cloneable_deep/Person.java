package shapes_with_cloneable_deep;

public class Person implements Cloneable {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            // if we did this next line and this much only and returned,
            // it would have been a shallow clone
            Person cloned = (Person) super.clone();

            // Deep copy of address
            cloned.address = new Address(this.address.getCity());

            // now returning
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
