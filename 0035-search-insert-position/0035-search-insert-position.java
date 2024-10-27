class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                index=i;
                break;
            }
            if(target>nums[i]){
                index=i+1;
                break;
            }
        }
       return index; 
    }
}