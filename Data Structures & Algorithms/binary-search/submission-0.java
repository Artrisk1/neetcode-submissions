class Solution {
    public int search(int[] nums, int target) {
        return(BS(nums,target,0,nums.length-1));
    }
    private int BS(int []nums,int target,int i,int j){
        int mid=i+(j-i)/2;
        if(i>j) {return -1;}
        if(nums[mid]==target){
            return mid;
        }
        else if (nums[mid]<target){
            return(BS(nums,target,mid+1,j));
        }
        else{
            return(BS(nums,target,i,mid-1));
        }
    }
    
    }
    
      
