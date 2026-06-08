class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans=new int[2];
       
        for(int j=0;j<nums.length;j++){
        for(int i=0;i<nums.length;i++){
            if(nums[j]+nums[i]==target){
                ans[0]=i;
                ans[1]=j;
                break;
            }
        }
        }
        return ans;
    }
}
