public class bubbleselectioninsertionsort {

    static void bubbleSort(int arr[]) {

        int n = arr.length;
        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("Bubble Sort");

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + " : ");
            printArray(arr);

            if (!swapped) {
                alreadySorted = true;
                break;
            } else {
                alreadySorted = false;
            }
        }

        System.out.println("Total Swaps = " + swaps);
        System.out.println("Already Sorted = " + alreadySorted);

        System.out.println("Top 3 Medalists");
        for (int i = n - 1; i >= n - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    static void selectionSort(int arr[]) {

        int n = arr.length;
        int swaps = 0;

        System.out.println("\nSelection Sort");

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swaps++;
            }

            System.out.print("Pass " + (i + 1) + " : ");
            printArray(arr);
        }

        System.out.println("Total Swaps = " + swaps);

        System.out.println("Top 3 Medalists");
        for (int i = n - 1; i >= n - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int arr[]) {

        int shifts = 0;

        System.out.println("\nInsertion Sort");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
                shifts++;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + " : ");
            printArray(arr);
        }

        System.out.println("Total Shifts = " + shifts);

        System.out.println("Top 3 Medalists");
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // a sports meet has 50 athletes with scores sort using bubble count total swaps
        // and flag if already sorted repeat with insertion sort and selection sort
        // find top 3 medalists trace pass by pass changes on
        // array => [64,25,12,22,11,45,23,44,56,56]

        int arr[] = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};

        int bubble[] = arr.clone();
        int selection[] = arr.clone();
        int insertion[] = arr.clone();

        bubbleSort(bubble);
        selectionSort(selection);
        insertionSort(insertion);
    }
}