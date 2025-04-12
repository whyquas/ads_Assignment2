public class MyDeque<T extends Comparable<T>> {
    private final MyLinkedList<T> list = new MyLinkedList<T>();

    public void addFirst(T item) {
        list.addFirst(item);
    }

    public void addLast(T item) {
        list.addLast(item);
    }

    public T removeFirst() {
        T val = list.getFirst();
        list.removeFirst();
        return val;
    }

    public T removeLast() {
        T val = list.getLast();
        list.removeLast();
        return val;
    }

    public T peekFirst() {
        return list.getFirst();
    }

    public T peekLast() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        Object[] arr = list.toArray();
        StringBuilder sb = new StringBuilder("Front -> ");
        for (Object o : arr) {
            sb.append(o).append(" ");
        }
        sb.append("<- Rear");
        return sb.toString();
    }
}
