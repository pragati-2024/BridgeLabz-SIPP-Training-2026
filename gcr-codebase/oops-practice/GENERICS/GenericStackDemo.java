package GENERICS;

import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> list = new ArrayList<>();

    void push(T value) {
        list.add(value);
    }

    void pop() {

        if (list.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Removed : " + list.remove(list.size() - 1));
    }

    void display() {
        System.out.println(list);
    }
}

public class GenericStackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();

        stack.display();
    }
}