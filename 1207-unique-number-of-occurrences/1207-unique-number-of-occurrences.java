class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> count = new HashSet<>();
        for (int freq : map.values()) {
            if (!count.add(freq)) {
                return false;
            }
        }
        return true;
    }
}