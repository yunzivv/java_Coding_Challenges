class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(my_string.charAt(i) < 'a') c -= 65;
            else c -= 71;
            answer[c]++;
        }
        return answer;
    }
}