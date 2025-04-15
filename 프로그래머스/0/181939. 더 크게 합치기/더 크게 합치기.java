class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        boolean big = Integer.parseInt(A+B) > Integer.parseInt(B+A);
        if(big){
            return Integer.parseInt(A+B);
        }else {
            return Integer.parseInt(B+A);
        }
        
    }
}