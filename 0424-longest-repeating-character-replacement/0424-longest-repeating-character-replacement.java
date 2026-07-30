class Solution {
    public int characterReplacement(String s, int k) {
       int []freq = new int[26];
       int max=0,l=0,maxl=0;
       for(int i=0; i<s.length(); i++){
        freq[s.charAt(i)-'A']++;
        max=Math.max(max,freq[s.charAt(i)-'A']);
        while((i-l+1)-max>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        maxl=Math.max(maxl,i-l+1);
       }
       return maxl;
    }
}