
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        List<Integer> uniqueNumbers = new ArrayList<>(count.keySet());
        uniqueNumbers.sort((a, b) -> count.get(b) - count.get(a));
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = uniqueNumbers.get(i);
        }
        
        return arr;
        
        }
        
        }
    

