class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 == 1 && b % 2 == 1){
            return a*a + b*b;
        } else if(a % 2 == 1 ^ b % 2 == 1){
            return 2*(a+b);
        } else {
            if(a-b < 0){
                return (a-b) * -1;
            }
            return a-b;
        }
    }
}