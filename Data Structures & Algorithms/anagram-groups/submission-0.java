class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            // 1. Convert to char array and sort it to create a "signature"
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            
            // 2. Convert the sorted char array back into a String to use as a key
            String signature = new String(chars);
            
            // 3. Add the ORIGINAL word to the list for this signature
            map.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
        }
        
        // 4. The map values contain all our grouped lists. 
        // We wrap them in a new ArrayList to match the return type.
        return new ArrayList<>(map.values());
    }
}
