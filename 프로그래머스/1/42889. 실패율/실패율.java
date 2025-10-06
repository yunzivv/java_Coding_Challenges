import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int max = Math.max(N, Arrays.stream(stages).max().getAsInt());
        int[] tried = new int[max + 1];
        int[] failed = new int[max + 1];

        for (int stage : stages) {
            tried[stage]++;
            failed[stage]++;
        }

        for (int i = max - 1; i >= 1; i--) {
            tried[i] += tried[i + 1];
        }

        List<double[]> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failureRate = (tried[i] == 0) ? 0 : (double) failed[i] / tried[i];
            list.add(new double[] {i, failureRate});
        }

        list.sort(Comparator.comparing((double[] i) -> i[1])
                            .reversed()
                            .thenComparing(i -> i[0]));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) list.get(i)[0];
        }

        return answer;
    }
}