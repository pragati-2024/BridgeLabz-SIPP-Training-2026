package GENERICS;

public class GenericMethodDemo {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T value : arr) {

            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 80, 50, 100};

        System.out.println("Maximum = " + findMax(numbers));
    }
}