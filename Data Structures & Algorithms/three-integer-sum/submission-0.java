class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> op=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int right=nums.length-1;
        int left=i+1;
          while(left<right){
            sum=nums[i]+nums[left]+nums[right];
            if(sum>0){
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                op.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }
          }
        }
        return op;
        
    }
}
