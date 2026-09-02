class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet=new HashSet<>();
        int left=0;
        int res=0;
        for(int r=0;r<s.length();r++){
         while(charSet.contains(s.charAt(r))){
           charSet.remove(s.charAt(left));
           left++;
         }
         charSet.add(s.charAt(r));
         res=Math.max(res,r-left+1);
        }
        return res;
    }
}
