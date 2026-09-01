class Solution {
    public boolean checkZeroOnes(String s) {
        int left=0;
        int right=0;
        int max1=0;
        int max0=0;

        while(right<s.length()){
            if(s.charAt(left)=='0'&&s.charAt(right)!=s.charAt(left)){
                max0=Math.max(max0,right-left);
                left=right;
            }else if(s.charAt(left)=='1'&&s.charAt(right)!=s.charAt(left)){
                max1=Math.max(max1,right-left);
                left=right;
            }

            right++;
        }

        if(s.charAt(left)=='0'){
            max0=Math.max(max0,right-left);
        } else if(s.charAt(left)=='1'){
            max1=Math.max(max1,right-left);
        }

        if(max1>max0){
            return true;
            }else{
                return false;
            }
}
}