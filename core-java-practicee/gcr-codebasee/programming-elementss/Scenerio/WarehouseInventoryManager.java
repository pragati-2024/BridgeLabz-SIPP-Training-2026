public class WarehouseInventoryManager {

    // Method to find max, min and total stock
    static void analyzeStock(int[] stock) {

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }

            if (quantity < min) {
                min = quantity;
            }

            total += quantity;
        }

        System.out.println("Maximum Stock : " + max);
        System.out.println("Minimum Stock : " + min);
        System.out.println("Total Stock   : " + total);
    }

    // Method to detect duplicates
    static void findDuplicates(int[] stock) {

        System.out.println("\nDuplicate Quantities:");

        boolean found = false;

        for (int i = 0; i < stock.length; i++) {

            for (int j = i + 1; j < stock.length; j++) {

                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);

                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }

    // Rotate array by k positions to the right
    static void rotateArray(int[] stock, int k) {

        int n = stock.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("\nRotated Stock Array:");

        for (int value : rotated) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    // Transpose a 2D shelf grid
    static void transposeGrid(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                transpose[j][i] = grid[i][j];
            }
        }

        System.out.println("\nTransposed Shelf Grid:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {50, 20, 75, 20, 90, 40, 75, 10};

        analyzeStock(stock);

        findDuplicates(stock);

        rotateArray(stock, 3);

        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transposeGrid(shelfGrid);
    }
}