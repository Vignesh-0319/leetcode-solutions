class Solution {
    public int distributeCandies(int[] ca) {
        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i<ca.length; i++){
            s.add(ca[i]);
        }
        return s.size()>ca.length/2 ? ca.length/2 : s.size(); 
    }
}