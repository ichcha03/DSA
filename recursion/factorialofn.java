package recursion;
import java.util.*;

public class factorialofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialofnum(1,n,1));
    }

    public static int factorialofnum(int i, int n, int product){
        if(i>n){
            return product;
        }
        product *= i;
        return factorialofnum(i+1, n,product);
    }
}

    

