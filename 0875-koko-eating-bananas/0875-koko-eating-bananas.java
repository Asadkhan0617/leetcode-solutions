class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=0;
        int ans=Integer.MAX_VALUE;

         for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            long totalHours = func(piles, mid);

            if(totalHours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

      public static long func(int[] piles, int mid) {
        long totalHours = 0;

        for (int i = 0; i < piles.length; i++) {
            totalHours += (piles[i] + mid - 1) / mid;
        }

        return totalHours;
    }
}