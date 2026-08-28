class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> np=new HashSet<>();
       int longest=0;
       for(int num:nums){
         np.add(num);
       }
       for(int num:nums){
        if(!np.contains(num-1)){
            int length=1;
            while(np.contains(num+length)){
                length++;
            }
            longest=Math.max(longest,length);
        }
       }
       return longest;
}
}

