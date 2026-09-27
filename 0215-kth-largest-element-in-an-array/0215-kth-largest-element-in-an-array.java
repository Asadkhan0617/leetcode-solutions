class Solution {
    PriorityQueue<Integer> minHeap;
    int k;
    public int findKthLargest(int[] nums, int k) {
         this.k=k;
        this.minHeap=new PriorityQueue<>();

        for(int num:nums){
            add(num);
        } 
        return minHeap.peek();
    }
    public void add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>k){
            minHeap.poll();
        }
    }
}