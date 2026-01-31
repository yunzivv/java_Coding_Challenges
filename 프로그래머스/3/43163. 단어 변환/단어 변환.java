import java.util.*;
import java.util.HashSet;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int index = -1;
        int len = begin.length();

        // words에 target 단어가 존재하지 않는 경우
        Set<String> set = new HashSet<>(Arrays.asList(words));
        if (!set.contains(target)) return 0;

        boolean[] used = new boolean[words.length];

        // 다음 단계 단어가 존재하는 지 여부
        while (set.size() > 0) {
            
            int check = 0;

            int bestIdx = -1;
            int bestScore = 11;

            // 무한반복일 경우 예외 처리
            while (check < words.length) {
                do index = (index + 1) % words.length;
                while (used[index]);

                String s = words[index];

                // 한 글자만 다른 지
                int diff = 0;
                for (int i = 0; i < len; i++) {
                    if (begin.charAt(i) != s.charAt(i)) diff++;
                    if (diff > 1) break;
                }
                check++;

                if (diff == 1) {
                    int score = 0;
                    for (int i = 0; i < len; i++) {
                        if (s.charAt(i) != target.charAt(i)) score++;
                    }

                    if (score < bestScore) {
                        bestScore = score;
                        bestIdx = index;
                    }
                }
            }

            if (bestIdx == -1) break;

            String next = words[bestIdx];
            set.remove(next);
            used[bestIdx] = true;
            begin = next;
            answer++;

            if (next.equals(target)) return answer;
        }

        return 0;
    }

}