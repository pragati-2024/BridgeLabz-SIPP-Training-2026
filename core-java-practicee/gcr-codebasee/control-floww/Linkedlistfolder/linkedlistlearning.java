
public class linkedlistlearning<T> {
    Node<T> head;
    Node<T> tail;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public T removeFirst() {
        T data = head.data;
        head = head.next;
        return data;
    }

    public T removeLast() {
        T data = tail.data;
        Node<T> temp = head;
        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKEDLIST");
            // System.out.println("NO ELEMENT IN LINKEDLIST");
            // return null;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        return data;
    }
    // class levvel generic use hoga

}