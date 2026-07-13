
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
            System.out.print(temp.data + " => ");
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
        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKEDLIST");
        }

        T data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public T removeLast() {
        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKEDLIST");
        }

        T data = tail.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        return data;
    }

    public Node<T> search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean insert(T data, T searchData) {
        Node<T> searchedNode = search(searchData);
        if (searchedNode == null) {
            throw new UnsupportedOperationException("ELEMENT NOT FOUND");
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = searchedNode.next;
        searchedNode.next = newNode;
        return true;
    }
    // class levvel generic use hoga

}