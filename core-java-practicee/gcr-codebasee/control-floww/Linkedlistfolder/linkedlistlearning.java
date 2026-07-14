
public class linkedlistlearning<T> {
    Node<T> head;
    Node<T> tail;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " => ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
    }

    public T removeFirst() {
        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKEDLIST");
        }

        T data = head.getData();
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public T removeLast() {
        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKEDLIST");
        }

        T data = tail.getData();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
        }

        return data;
    }

    public Node<T> search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public boolean insert(T data, T searchData) {
        Node<T> searchedNode = search(searchData);
        if (searchedNode == null) {
            throw new UnsupportedOperationException("ELEMENT NOT FOUND");
        }
        Node<T> newNode = new Node<>(data);
        newNode.setNext(searchedNode.getNext());
        searchedNode.setNext(newNode);
        return true;
    }
    // class levvel generic use hoga

}