package recursion;
import java.util.*;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] reversed = reverseanarr(arr,n,0);
        System.out.println(Arrays.toString(reversed));
    }
    public static int[] reverseanarr(int[] arr, int n, int i){
        if(i==arr.length/2){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[n-1];
        arr[n-1] = temp;
        return reverseanarr(arr,n-1,i+1);
    }
}

