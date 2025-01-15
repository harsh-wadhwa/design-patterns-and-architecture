package iteractorExample;

public class Main {
    public static void main(String[] args) {

        CustomList<String> names = new CustomList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator iterator = names.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}