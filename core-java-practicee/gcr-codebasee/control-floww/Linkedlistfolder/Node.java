
public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
