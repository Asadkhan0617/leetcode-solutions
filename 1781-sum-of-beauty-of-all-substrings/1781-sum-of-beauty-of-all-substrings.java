class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int left = 0; left < n; left++) {
            int[] freq = new int[26];

            for (int right = left; right < n; right++) {
                freq[s.charAt(right) - 'a']++;

                if (right - left + 1 >= 3) {
                    int maxFreq = 0;
                    int minFreq = Integer.MAX_VALUE;

                    for (int count : freq) {
                        if (count > 0) {
                            maxFreq = Math.max(maxFreq, count);
                            minFreq = Math.min(minFreq, count);
                        }
                    }

                    sum += maxFreq - minFreq;
                }
            }
        }

        return sum;
    }
}