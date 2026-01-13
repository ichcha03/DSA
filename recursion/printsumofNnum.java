package recursion;
import java.util.*;

public class printsumofNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofnums(0,1,n));
    }
    public static int sumofnums(int sum, int i, int N){
        if(i>N){
            return sum;
        }
        sum+= i;
        return sumofnums(sum, i+1, N);
    }
    
}
