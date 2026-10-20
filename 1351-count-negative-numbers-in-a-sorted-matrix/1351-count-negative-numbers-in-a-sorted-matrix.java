class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int row=0;row<grid.length;row++){
            int left=0;
            int right=grid[row].length-1;

            int mid=0;

            while(left<=right){
                mid=left+(right-left)/2;

                if(grid[row][mid]>=0){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            count=count+(grid[row].length-left);
        }
        return count;
    }
}