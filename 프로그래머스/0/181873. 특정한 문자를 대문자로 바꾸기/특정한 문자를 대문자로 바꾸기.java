class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            char a = alp.charAt(0);
            if(c == a){
                c -= 32;
            }
            answer += c;
        }
        return answer;
    }
}