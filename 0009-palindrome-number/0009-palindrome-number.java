class Solution {
    public boolean isPalindrome(int x) {
        String y=Integer.toString(x);
        int left=0;
        int right=y.length()-1;
        while(left<right){
            if(y.charAt(left)==y.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}