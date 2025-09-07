package recursion;
import java.util.*;

public class printname {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnames(n);
    }

    public static void printnames(int n){
        if(n==5){
            return;
        }
        System.out.println("Ichcha");
        printnames(n+1);
    }
    
}
