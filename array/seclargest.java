import java.util.*;
public class seclargest {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int seclargest = -1;
        int largest = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(largest<nums[i]){
                seclargest = largest;
                largest = nums[i];
            } 
            else if(nums[i]<largest && nums[i]>seclargest){
                seclargest = nums[i];
            }
        }
        System.out.println(seclargest);
    }
}