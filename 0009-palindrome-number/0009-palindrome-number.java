class Solution {
    public boolean isPalindrome(int x) {
        int k=x,rev_num=0;
        while(x>0){
            rev_num=rev_num*10+x%10;
            x=x/10;
        }
        if(k==rev_num)
            return true;
        else
            return false;
    }
}