class Solution {
    public int removeElement(int[] nums, int val) {
        int ct=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ct]=nums[i];
                ct++;
            }
    }
    return ct;
    }
}