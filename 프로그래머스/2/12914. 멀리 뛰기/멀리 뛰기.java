class Solution {
    public long solution(int n) {
        if (n <= 2) return n;

        long[] st = new long[n + 1];
        st[1] = 1L;
        st[2] = 2L;

        for (int i = 3; i <= n; i++) {
            st[i] = (st[i - 1] + st[i - 2]) % 1234567;
        }

        return st[n];
    }
}