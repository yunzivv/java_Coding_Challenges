class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            answer[i] = -1;
            if(i == 0) continue;
            for(int j = 0; j < i; j++){
                if(c == s.charAt(j)) answer[i] = i - j;
            }
        }
        
        return answer;
    }
}