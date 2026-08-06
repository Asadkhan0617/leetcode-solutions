class Solution {
     public int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];

        int[] stack = new int[temp.length];
        int top = -1;

        for (int i = 0; i < temp.length; i++) {
            while (top != -1 && temp[stack[top]] < temp[i]) {
                int idx = stack[top--];
                result[idx] = i - idx;
            }
            stack[++top] = i;
        }

        return result;
    }
}