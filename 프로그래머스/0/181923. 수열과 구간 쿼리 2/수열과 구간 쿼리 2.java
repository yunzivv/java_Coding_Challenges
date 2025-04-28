class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int re;
        for(int i = 0; i < queries.length; i++){
            re = 1000000;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2] && arr[j] < re) re = arr[j];
            }
            if(re == 1000000) re = -1;
            answer[i] = re;
        }
        return answer;
    }
}