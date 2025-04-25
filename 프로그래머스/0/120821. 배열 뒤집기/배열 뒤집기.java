class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        int i = 0;
        for(int a = len-1; a > -1; --a){
            answer[i] = num_list[a];
            ++i;
        }
        return answer;
    }
}