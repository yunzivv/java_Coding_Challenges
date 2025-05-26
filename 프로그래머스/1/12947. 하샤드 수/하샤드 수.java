
class Solution {
    public boolean solution(int x) {
        String num = "" + x;
        int numx = 0;
        for(int i = 0; i < num.length(); i++){
            numx += num.charAt(i) - 48;
        }
        return x % numx == 0;
    }
}