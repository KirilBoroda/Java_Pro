package thread.safe.list.hillel;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> list;

    public ThreadSafeList() {
        list = new ArrayList<>();
    }

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    public synchronized T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return null;
    }
}
