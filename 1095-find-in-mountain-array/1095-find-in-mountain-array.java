/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();

        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
        if(mountainArr.get(mid)>mountainArr.get(mid+1)){
            right=mid;
        }else{
            left=mid+1;
        }
        }
        int peak=left;

        int firstTry=orderAgnosticBS(mountainArr,target,0,peak,true);

        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(mountainArr,target,peak+1,n-1,false);
    }

    static int orderAgnosticBS(MountainArray arr, int target, int start, int end,boolean asc) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int value=arr.get(mid);

            if (value == target) {
                return mid;
            }

            if (asc) {
                if (target < value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
}