class Solution {
    public int maxArea(int[] heights) {
        int area;
        int res=0;
        int left=0;
        int right=heights.length-1;
        while (left<right){
            area=Math.min(heights[left],heights[right])*(right-left);
res=Math.max(res,area);
if(heights[left]<=heights[right]){
    left++;
}
else{
    right--;
}
        }
        
        return res;
    }

        
    }


