class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int temp = 0;
        for(int i = 0; i < num_list.length; i++){
            for(int j = 0; j < num_list.length; j++){
                if(num_list[i] < num_list[j]){
                    temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        int a = 0;
        for(int i = 5; i < num_list.length; i++){
            answer[a] = num_list[i];
            a++;
        }
        return answer;
    }
}