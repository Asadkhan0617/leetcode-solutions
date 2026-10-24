class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<=s.length();i++){
            String op=leftRotate(s,i);
            if(op.equals(goal)){
                return true;
            }
        }
        return false;
    }
    public String leftRotate(String s, int i) {
    int n = s.length();
    i = i % n;

    return s.substring(i) + s.substring(0, i);
}
}