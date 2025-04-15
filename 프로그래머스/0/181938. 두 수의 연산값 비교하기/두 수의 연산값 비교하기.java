class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = Integer.toString(a) + Integer.toString(b);
        int i = 2 * a * b;
        
        boolean big = Integer.parseInt(str) > i;
        if(big){
            return Integer.parseInt(str);
        }else {
            return i;
        }
    }
}