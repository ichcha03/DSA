package recursion;
import java.util.*;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        sol.printNumbers(n);
    }
}

class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        printnum(1,n);
    }
    public void printnum(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printnum(i+1, n);
    }
}