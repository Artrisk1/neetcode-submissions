class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
            return "";
        }
        // Start by assuming the first word is the common prefix
        String prefix = strs[0];
        
        // Loop through the remaining words in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current word does NOT start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, they share nothing
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}