public class Stack<T> {
    private Node head;
    private final String EMPTY = "EMPTY";
    private final String ARROW = " -> ";

    public Node getHead() {
        return head;
    }

    public void push(T value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public T pop() {
        if (head == null) {
            System.out.println(EMPTY);
            return null;
        } else {
            T value = (T) head.getValue();
            head = head.getPrev();
            return value;
        }
    }

    public void printme() {
        if (head == null) {
            System.out.println(EMPTY);
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.getValue());
                if (node.getPrev() != null) {
                    System.out.print(ARROW);
                }
                node = node.getPrev();
            }
            System.out.println("\n");
        }
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Stack reverse() {
        if (head == null) {
            return this;
        }
        Stack reversedStack = new Stack();
        HeadTail headTail = reversedHead(head);
        reversedStack.setHead(headTail.getHead());
        return reversedStack;
    }

    private HeadTail reversedHead(Node head) {
        Node newHead = new Node(head.getValue(), null);
        if (head.getPrev() == null)  {
            return new HeadTail(newHead, newHead);
        } else {
            HeadTail headTail = reversedHead(head.getPrev());
            headTail.setTailPrev(newHead);
            return new HeadTail(headTail.getHead(), newHead);
        }
    }
}