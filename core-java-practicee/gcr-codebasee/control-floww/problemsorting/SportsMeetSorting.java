package problemsorting;

import java.util.Arrays;

public class SportsMeetSorting {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {

        int swaps = 0;
        boolean swapped;

        System.out.println("Bubble Sort Passes:");

        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + " : " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Array already sorted (Best Case).");
                break;
            }
        }

        System.out.println("Total Swaps : " + swaps);
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nInsertion Sort Result:");
        System.out.println(Arrays.toString(arr));
    }

    // Top 3 Scores
    public static void topThree(int[] arr) {

        Arrays.sort(arr);

        System.out.println("\nTop 3 Medalists Scores:");

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] athletes = {64, 25, 12, 22, 11};

        int[] bubbleArray = athletes.clone();
        int[] insertionArray = athletes.clone();

        bubbleSort(bubbleArray);

        insertionSort(insertionArray);

        topThree(athletes);
    }
}