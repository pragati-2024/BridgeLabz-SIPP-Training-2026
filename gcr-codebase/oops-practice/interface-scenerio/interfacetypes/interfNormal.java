package interfacetypes;

interface Animal {

    void sound();

    void eat();
}

public class InterfNormal {

    static class Dog implements Animal {

        @Override
        public void sound() {
            System.out.println("Dog barks");
        }

        @Override
        public void eat() {
            System.out.println("Dog eats food");
        }
    }

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}