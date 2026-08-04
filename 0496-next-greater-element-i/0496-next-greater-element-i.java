class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        int[] map = new int[10001];
        
        int[] stack = new int[nums2.length];
        int top = -1;
        
        for (int num : nums2) {
            
            while (top >= 0 && num > stack[top]) {
                map[stack[top]] = num; 
                top--;
            }
        
            stack[++top] = num;
        }
        
    
        while (top >= 0) {
            map[stack[top--]] = -1;
        }
        

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map[nums1[i]];
        }
        
        return result;
    }
}