class Solution {
    public int distributeCandies(int[] ca) {
        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i<ca.length; i++){
            s.add(ca[i]);
        }
        return Math.min(s.size(), ca.length/2); 
    }
}