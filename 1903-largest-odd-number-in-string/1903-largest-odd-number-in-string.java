class Solution {
    public String largestOddNumber(String num) {
        int mark=-1;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)=='1'||num.charAt(i)=='3'||num.charAt(i)=='5'||num.charAt(i)=='7'||num.charAt(i)=='9'){
                mark=i;
            }
        }
        num = num.substring(0,mark+1);
        return num;
    }
}