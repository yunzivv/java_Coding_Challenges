class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = -1;
        }
        int index = 0;
        for(int i : arr){
            boolean isExist = false;
            for(int j : answer){
                if(i == j) isExist = true;
            }
            if(!isExist){
                answer[index++] = i;
            }
            if(index == answer.length) break;
        }
        return answer;
    }
}