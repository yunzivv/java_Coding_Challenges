class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for(int i = 0; i < len; i++){
            answer[i] = num_list[i];
        }
        if(answer[len - 2] < answer[len - 1]){
            answer[len] = answer[len - 1]-answer[len - 2];
            
        } else {
            answer[len] = answer[len-1] *2;   
        }
        return answer;
    }
}