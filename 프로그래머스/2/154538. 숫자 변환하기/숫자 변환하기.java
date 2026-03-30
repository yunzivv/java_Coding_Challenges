import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {

        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        q.add(new int[]{x, 0});
        visited[x] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int num = cur[0];
            int cnt = cur[1];

            if (num == y) return cnt;

            int[] next = {num * 2, num * 3, num + n};

            for (int nx : next) {
                if (nx <= y && !visited[nx]) {
                    visited[nx] = true;
                    q.add(new int[]{nx, cnt + 1});
                }
            }
        }

        return -1;
    }
}