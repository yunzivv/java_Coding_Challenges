import java.util.*;

class Solution {
    public static int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int ans = 0;
        int index = 1;
        int len = msg.length();

        for (index = 1; index <= 26; index++) {
            map.put(String.valueOf((char) (64 + index)), index);
        }

        for (int i = 0; i < len; i++) {
            String s = String.valueOf(msg.charAt(i));
            ans = map.get(s);

            while (i + 1 < len && map.containsKey(s + msg.charAt(i + 1))) {
                s += msg.charAt(++i);
                ans = map.get(s);
            }

            answer.add(ans);

            if (i + 1 < len) {
                map.put(s + msg.charAt(i + 1), index++);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}