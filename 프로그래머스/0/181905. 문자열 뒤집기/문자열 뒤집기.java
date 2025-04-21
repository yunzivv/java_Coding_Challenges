class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(i == s){
                for(i = e; i > s - 1; i--){
                    answer += String.valueOf(my_string.charAt(i));        
                }
                i = e + 1;
                if(i == my_string.length()) break;
            }
            answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}