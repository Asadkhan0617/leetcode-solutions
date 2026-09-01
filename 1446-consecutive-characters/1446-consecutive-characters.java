class Solution {
    public int maxPower(String s) {
         int left=0;
         int max=0;
         int right=0;

         while( right<s.length()){
            if(s.length()==1){
                return 1;
            }

            if(s.charAt(right)!=s.charAt(left)){
                max=Math.max(max,s.substring(left,right).length());
                left=right;
            }
            right++;
         }
         return max=Math.max(max,right-left);
    }
}