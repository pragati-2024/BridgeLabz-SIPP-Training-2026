public class RecursiveAlgorithms {

    static void towerOfHanoi(int n, char source,
                             char helper, char destination) {

        if (n == 1) {
            System.out.println(source + " -> " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println(source + " -> " + destination);

        towerOfHanoi(n - 1, helper, source, destination);
    }

    static int binarySearch(int[] arr, int left,
                            int right, int target) {

        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target) return mid;

        if (target < arr[mid])
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    static String reverse(String str) {
        if (str.length() == 0) return "";

        return reverse(str.substring(1)) + str.charAt(0);
    }

    static boolean isBalanced(String str,
                              int index,
                              int count) {

        if (count < 0) return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return isBalanced(str, index + 1, count + 1);

        if (str.charAt(index) == ')')
            return isBalanced(str, index + 1, count - 1);

        return isBalanced(str, index + 1, count);
    }

    public static void main(String[] args) {

        towerOfHanoi(3, 'A', 'B', 'C');

        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(arr, 0,
                arr.length - 1, 7));

        System.out.println(sumOfDigits(1234));

        System.out.println(reverse("Pragati"));

        System.out.println(isBalanced("(())", 0, 0));
    }
}