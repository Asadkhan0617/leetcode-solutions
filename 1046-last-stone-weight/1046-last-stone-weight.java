class Solution {
    PriorityQueue<Integer> maxHeap;
    public int lastStoneWeight(int[] stones) {
        maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());

        if(stones.length==1){
            return stones[0];
        }

        for(int stone:stones){
            add(stone);
        }


        while(maxHeap.size()>1){
        int right=maxHeap.poll();
        int left=maxHeap.poll();

        if(left==right){
            left=0;
            right=0;
        }else {
            right=right-left;
            left=0;
            maxHeap.offer(right);
        }
        }
    return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

     public void add(int val) {
        maxHeap.offer(val);
    }
}