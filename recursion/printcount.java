package recursion;
import java.util.*;

public class printcount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnumbers(n);
    }

    public static void printnumbers(int n){
        if(n==10){
            return;
        }
        System.out.println(n);
        printnumbers(n+1);
    }
    
}
