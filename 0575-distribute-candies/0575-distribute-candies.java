class Solution {
    public int distributeCandies(int[] ca) {
        Set<Integer> s = new HashSet<>();
        for(int i : ca){
            s.add(i);
            if(s.size()>ca.length/2) return ca.length/2;
        }
        return s.size(); 
    }
}