class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        if(word.length()<=8){
            sum=word.length();
        }
        else if(word.length()<=16){
            sum=8+(word.length()-8)*2;
        }
        else if(word.length()<=24){
            sum=24+(word.length()-16)*3;
        }
        else{
            sum=48+(word.length()-24)*4;
        }
        return sum;
    }
}