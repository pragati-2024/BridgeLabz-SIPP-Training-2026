package GENERICS;

class Pair<T, U> {

    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}

public class GenericPairDemo {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Pragati", 101);

        pair.display();
    }
}