public class CustomerOrderValuesMergeSort {

    static void merge(int arr[], int left, int mid, int right) {

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int leftArray[] = new int[leftSize];
        int rightArray[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            arr[k++] = rightArray[j++];
        }
    }

    static void mergeSort(int arr[], int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        // Daily customer order values.
        // Sort using Merge Sort.
        // Array => [850,420,1200,650,300]

        int arr[] = {850, 420, 1200, 650, 300};

        mergeSort(arr, 0, arr.length - 1);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}