public class Node<T> {
    private T  value;
    private Node prev;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public Node(T value, Node prev) {
        this.value = value;
        this.prev = prev;
    }
}