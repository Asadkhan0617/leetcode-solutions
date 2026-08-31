class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<>();
         if(digits.isEmpty()){
            return list;
         }
          list.addAll(pad("",digits));
          return list;
    }

    ArrayList<String> pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit =up.charAt(0)-'0';

        String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

          String letters = keypad[digit];

          ArrayList<String> list=new ArrayList<>();

          for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(pad(p + ch, up.substring(1)));
        }

        return list;
    }
}