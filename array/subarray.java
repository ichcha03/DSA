public class subarray {
    public int longestSubarray(int[] nums, int k) {
        int sum = 0;
        int length = 0;
        for(int i =0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                for(int l = i; l<=j; l++){
                    sum+=nums[l];
                }
                int len = j-i+1;
                if(sum==k && len>length){
                    length = len;
                    break;
                }
                sum = 0;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        subarray s = new subarray();
        int[] nums = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(s.longestSubarray(nums, k));
    }
}
