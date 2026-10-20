class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int num = 0;
        s = s.trim();
        int n = s.length();
        
        if (s.length() == 0) return 0;

        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Step 3: Process digits
        while (i < n && s.charAt(i) >= '0'
                     && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1
                    ? Integer.MAX_VALUE
                    : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}