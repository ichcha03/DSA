class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            int minindex = i;
            int j = i+1;
            while(j<nums.length){
                // nums[i] = Math.min(nums[i],nums[j]);
                // j++;
                if(nums[j]<nums[minindex]){
                    minindex = j;
                }
                j++;
            }
            if(minindex!=i){
                int temp = nums[i];
                nums[i] = nums[minindex];
                nums[minindex] = temp;
            }
        }
        return nums;
    }
}