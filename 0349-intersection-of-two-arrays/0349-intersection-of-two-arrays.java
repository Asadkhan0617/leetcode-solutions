class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> inter = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                inter.add(num);
            }
        }

        int[] result = new int[inter.size()];
        int index = 0;
        for (int num : inter) {
            result[index++] = num;
        }    
        return result;
    }
}