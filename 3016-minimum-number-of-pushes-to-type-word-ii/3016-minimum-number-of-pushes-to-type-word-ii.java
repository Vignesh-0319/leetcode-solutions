class Solution {
    public int minimumPushes(String word) {
        int []freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int pushes = 0;
        int cnt = 0;
        int cost = 1;
        for(int i = 25; i>=0; i--){
            if(freq[i]==0) break;
            pushes = pushes + freq[i] * cost;
            cnt++;
            if(cnt%8==0) cost++;
        }
        return pushes;
        }
}