class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        int arrLen = arr.length;
        while(len < arrLen){
            len *= 2;
        }
        int[] answer = new int[len];
        for(int i = 0; i < arrLen; i++){
            answer[i] = arr[i];
        }
        for(int i = arrLen; i < len; i++){
            answer[i] = 0;
        }
        return answer;
    }
}