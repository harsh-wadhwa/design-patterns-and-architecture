package iteractorExample;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> implements Collection<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(items);
    }

}
