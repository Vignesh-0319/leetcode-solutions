class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        String temp=s.substring(0,n/2);
        char chars[]=temp.toCharArray();
        Arrays.sort(chars);
        String left=new String(chars);
        StringBuilder res = new StringBuilder();
        res.append(left);
        if(n%2==1){
            res.append(s.charAt(n/2));
        }
        res.append(new StringBuilder(left).reverse());
        return res.toString();
    }
}