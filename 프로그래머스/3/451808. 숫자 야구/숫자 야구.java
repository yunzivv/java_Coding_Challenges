import java.util.function.Function;
import java.util.*;

class Solution {
    public int solution(int n, Function<Integer, String> submit) {
        List<String> candidates1 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        map.put("0S 0B", 0);map.put("0S 1B", 1);map.put("0S 2B", 2);map.put("0S 3B", 3);map.put("0S 4B", 4);
        map.put("1S 0B", 5);map.put("1S 1B", 6);map.put("1S 2B", 7);map.put("1S 3B", 8);
        map.put("2S 0B", 9);map.put("2S 1B", 10);map.put("2S 2B", 11);
        map.put("3S 0B", 12);map.put("4S 0B", 13);


        for (int a = 1; a <= 9; a++)
            for (int b = 1; b <= 9; b++)
                for (int c = 1; c <= 9; c++)
                    for (int d = 1; d <= 9; d++) {
                        if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
                            candidates1.add("" + a + b + c + d);
                        }
                    }

        String first = submit.apply(1234);
        List<String> candidates2 = new ArrayList<>();
        for(String s : candidates1) {
            if(baseball("1234", s).equals(first)) candidates2.add(s);
        }

        String second = submit.apply(5678);
        List<String> candidates3 = new ArrayList<>();
        for(String s : candidates2) {
            if(baseball("5678", s).equals(second)) candidates3.add(s);
        }

        List<String> candidates = candidates3;
        int turn = 5;
        while (candidates.size() > 1 && turn-- > 0) {

            int[] bestMove = new int[candidates.size()];
            int index = 0;
            for (String s : candidates) {
                int[] part = new int[14];

                for (String s2 : candidates) {
                    String result = baseball(s, s2);
                    part[map.get(result)]++;
                }

                int worst = 0;
                for (int v : part) worst = Math.max(worst, v);
                bestMove[index++] = worst;
            }

            int best = Integer.MAX_VALUE;
            int bestIndex = 0;
            for (int i = 0; i < bestMove.length; i++) {
                if (bestMove[i] < best) {
                    best = bestMove[i];
                    bestIndex = i;
                }
            }

            String target = candidates.get(bestIndex);
            String res = submit.apply(Integer.parseInt(target));

            if ("4S 0B".equals(res)) return Integer.parseInt(target);

            List<String> next = new ArrayList<>();
            for (String s : candidates) {
                if (baseball(target, s).equals(res)) next.add(s);
            }
            candidates = next;
        }

        return Integer.parseInt(candidates.get(0));
    }
    
    private static String baseball(String check, String answer) {
    int strike = 0;
    int ball = 0;

    for (int i = 0; i < 4; i++) {
        if (check.charAt(i) == answer.charAt(i)) {
            strike++;
        } else if (answer.indexOf(check.charAt(i)) != -1) {
            ball++;
        }
    }
    return strike + "S " + ball + "B";
}

}