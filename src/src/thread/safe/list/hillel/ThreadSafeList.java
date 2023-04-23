package thread.safe.list.hillel;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {

    private List<T> list = new ArrayList<>();

    public synchronized void add(T item) {
        list.add(item);
    }

    public synchronized void remove(T item) {
        list.remove(item);
    }

    public synchronized T get(int index) {
        return list.get(index);
    }
}


