class Solution {
    public int distributeCandies(int[] ca) {
        Set<Integer> s = new HashSet<>();
        for(int i : ca){
            s.add(i);
        }
        return Math.min(s.size(), ca.length/2); 
    }
}