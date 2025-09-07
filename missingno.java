import java.util.*;
public class missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr, n));
    }

    public static int missingNumber(int[] arr, int n) {
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return total - sum;
    }
}
