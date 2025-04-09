class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int fa = 0;
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                fa++;
            }
        }
        String[] answer = new String[fa];
        int index = 0;
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}