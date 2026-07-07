package GENERICS;

import java.util.ArrayList;

class Repository<T> {

    ArrayList<T> data = new ArrayList<>();

    void add(T value) {
        data.add(value);
    }

    void display() {

        for (T value : data) {
            System.out.println(value);
        }
    }
}

public class GenericRepositoryDemo {

    public static void main(String[] args) {

        Repository<String> repo = new Repository<>();

        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        repo.display();
    }
}