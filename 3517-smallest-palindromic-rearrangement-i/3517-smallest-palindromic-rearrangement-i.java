class Solution {
    public String smallestPalindrome(String s) {
        char[] input = s.toCharArray();
        
        int[] count = new int[26];
        
        for (char c: input)
            count[c-'a']++;
        
        int j=0;
        char[] output = new char[s.length()];
        for (int i=0;i<26;i++){
            int f = count[i];            
            char curr = (char) ('a' + i);
            while (f>1){
                output[j] = curr;
                output[s.length()-1-j] = curr;
                 f -= 2;
                 j++;
            }
            if (f==1)
                output[s.length()/2] = curr;            
        }
        return new String(output);
    }
}