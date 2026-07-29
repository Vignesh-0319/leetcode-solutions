class Solution {
    public String largestOddNumber(String str) {
        int mark=-1;
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)%2 !=0){
                mark=i;
                break;
            }
        }
        return(str.substring(0,mark+1));
    }
}