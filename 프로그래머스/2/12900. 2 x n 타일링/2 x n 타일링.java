class Solution {
    public int solution(int n) {
        long a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            long c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return (int) b;
    }
}