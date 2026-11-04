import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right = 0; right < nums.length; right++) {

            int current = nums[right];
            while (map.containsKey(current)) {

                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }
            map.put(current, 1);
            sum += current;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}