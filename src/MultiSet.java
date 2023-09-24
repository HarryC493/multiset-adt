public interface MultiSet <T> {
    void add(T item);
    void remove(T item);
    void contains(T item);
    void isEmpty();
    void count(T item);
    void size();
}
