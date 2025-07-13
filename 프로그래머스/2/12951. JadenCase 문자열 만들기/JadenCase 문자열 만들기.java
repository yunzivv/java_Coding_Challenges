class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            index++;
            char c = s.charAt(i);
            if(c == ' '){
                index = 0;
                answer += " ";
                continue;
            }
            answer += index == 1 ? Character.toUpperCase(c) : Character.toLowerCase(c); 
        }
        return answer;
    }
}