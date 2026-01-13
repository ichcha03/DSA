package recursion;
import java.util.*;

public class printnto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }
    public static void printnum(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    
}
