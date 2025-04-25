class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int len = my_string.length();
        char let = letter.charAt(0);
        for(int i = 0; i < len; ++i){
            if (my_string.charAt(i) != let){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}