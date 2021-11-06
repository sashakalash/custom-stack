public class HeadTail {
    private Node head;
    private Node tail;

    public HeadTail(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTailPrev(Node node) {
        tail.setPrev(node);
    }
}