import java.util.*;
public class runningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
