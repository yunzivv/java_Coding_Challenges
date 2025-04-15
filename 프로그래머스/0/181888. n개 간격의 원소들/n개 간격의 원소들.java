class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length - 1) / n + 1;
        int[] answer = new int[len];
        int index = 0;
        for(int i = 0; i < len; i++){
            answer[i] = num_list[index];
            index += n;
        }
        
        return answer;
    }
}