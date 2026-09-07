class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        for(int i=1;i<height.length;i++ ){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        for(int right=n-2;right>=0;right--){
            rightMax[right]=Math.max(height[right],rightMax[right+1]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res=res+Math.min(leftMax[i],rightMax[i])-height[i];
        }
return res;
    }
}
