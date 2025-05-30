class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int len = arr.length;
        int[] arr2 = arr.clone();
        while (true) {
            answer++;
            for (int j = 0; j < len; j++) {
                if (arr[j] >= 50 && arr[j] % 2 == 0) arr[j] /= 2;
                else if (arr[j] < 50 && arr[j] % 2 == 1) {
                    arr[j] = arr[j] * 2 + 1;
                }
            }
            for (int j = 0; j < len; j++) {
                if (arr[j] >= 50 && arr[j] % 2 == 0) arr2[j] = arr[j] / 2;
                else if (arr[j] < 50 && arr[j] % 2 == 1) {
                    arr2[j] = arr[j] * 2 + 1;
                } else arr2[j] = arr[j];
            }
            boolean eq = true;
            for (int i = 0; i < len; i++) {
                if (arr[i] != arr2[i]) {
                    eq = false;
                    break;
                }
            }
            if (eq) break;
        }
        return answer == 1 ? 0 : answer;

    }
}