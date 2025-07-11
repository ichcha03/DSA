import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = n-1; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
