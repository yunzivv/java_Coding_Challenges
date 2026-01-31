import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(routes, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        for(int[] route : routes){list.add(route);}

        while (list.size() > 0) {

            int min = list.get(0)[0];
            int max = list.get(0)[1];
            for(int i  = 1; i < list.size(); i++) {
                int[] route = list.get(i);
                if (route == null) continue;
                if(route[0] <= max || route[1] <= min) {
                    min = Math.max(min, route[0]);
                    max = Math.min(max, route[1]);
                    list.set(i , null);
                }
            }
            list.remove(0);
            list.removeIf(Objects::isNull);
            answer++;

        }

        return answer;
    }
}